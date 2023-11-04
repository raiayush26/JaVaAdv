import java.util.Arrays;

public class LCS {
    // Tabulation by didi
    public static int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int dp[][] = new int [n+1][m+1];
              
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j]= dp[i-j][j-1] +1;
                }
                else{
                    int ans1 = dp[i-1][j]; // upcell
                    int ans2 = dp[i][j-1]; // left cell
                    dp[i][j] = Math.max(ans1,ans2);
                }

            }
        }


        return dp[n][m];
    }
    // Tabulation by Love Babber
    public int longestCommonSubsequenceTab(String text1, String text2) {
        int n= text1.length();
        int m = text2.length();
        int [][]dp = new int[n+1][m+1]; 
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(text1.charAt(i)==text2.charAt(j)){
                    dp[i][j]= dp[i+1][j-1] +1;
                }else{
                    int ans1=  dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j]= Math.max(ans1,ans2);
                }

            }
        }
        return dp[n][m];
    }
    // Memomization Approach
    public static  int solve(String a, String b, int i,int j,int dp[][]){
        if(i==a.length()){return 0;}
        if(j==b.length()){return 0;}
        if(dp[i][j]!= -1){
            return dp[i][j];
        }
        int ans=0;
        if(a.charAt(i)==b.charAt(j)){
            ans=1+solve(a,b,i+1,j+1,dp);
        }
        else{
            ans = Math.max(solve(a,b,i+1,j,dp),solve(a,b,i,j+1,dp));
        }
        dp[i][j]= ans;
        return dp[i][j];
    }
    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2= "abedg";
        int n= str1.length();
        int m= str2.length();
        // intilizial the dp array
        int dp[][] =new int [n+1][m+1];
        for(int i=0;i<n+1;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(solve(str1,str2,0,0,dp));
        //System.out.println(longestCommonSubsequence(str1,str2));

    }
}

