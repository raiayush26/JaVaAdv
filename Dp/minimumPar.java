import java.util.Arrays;

class minimumPar{
    public static int minimumDifference(int[] nums) {
        int n = nums.length;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int W= sum/2;

        int dp [][]= new int [n+1][W+1];
        
        for(int i=1 ;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                if(nums[i-1]<=j){
                    dp[i][j]=Math.max(nums[i-1] +dp[i-1][j-nums[i-1]] ,dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        int sum1= dp[n][W];
        int sum2=sum-sum1;
        return Math.abs(sum1-sum2);
    }
    public static int jump(int[] nums) {
        int n = nums.length;
        int dp[] = new int [n];
        Arrays.fill(dp,-1);
        dp[n-1]=0;

        for(int i=n-2;i>=0;i--){
            int step= nums[i];
            int ans =Integer.MAX_VALUE;
            for( int j=i+1; j<=i+step && j<n;j++){
                if(dp[j] != -1){
                    ans= Math.min(ans,dp[j]+1);
                }
            }
            if(ans!=Integer.MAX_VALUE ){
                dp[i]= ans;
            }
        }
        return dp[0];
    }
    public static int coinChange(int[] coins, int sum) {
        int n = coins.length;
        int dp [][] = new int [n+1][sum+1];
        
        for(int i=0;i<n+1;i++){
            dp[i][0]=1;
        }
        for(int j=1;j<sum+1;j++){
            dp[0][j]=0;
        }
        for (int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(coins[i-1]<=j){
                    dp[i][j]= dp[i][j-coins[i-1]]+dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
    
   
     return dp[n][sum]; 
    }
    public static void main(String[] args) {
        int nums[] ={1,6,11,5};
        int num2[] ={2,3,1,1,4};
        int coins[]={1,2,3};
        int sum= 4;
      //  System.out.println(minimumDifference(nums));
     // System.out.println(jump(num2));
     System.out.println(coinChange(coins, sum));
    }
}