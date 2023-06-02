public class MinDistace {
    public static int minDistance(String word1, String word2) {
        int n= word1.length();
        int m= word2.length();
        
        int dp[][] = new int [n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0){
                    dp[i][j]=j;
                }
                else if(j==0){
                    dp[i][j]= i;
                }else{
                    dp[i][j]=0;
                }
            }
        }
        
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    //add
                    int ans1= dp[i][j-1]+1;
                    //del
                    int ans2=dp[i-1][j+1]+1;
                    //repitation
                    int ans3=dp[i-1][j-1]+1;
              dp[i][j]= Math.min(ans1,Math.min(ans2,ans3));
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String a="horse";
        String b= "ros";
        System.out.println( minDistance(a,b));
    }
}
