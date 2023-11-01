import java.util.Arrays;

public class LCS {
    public static int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int dp[][] = new int [n+1][m+1];
        
        // for (int[] row : dp){
        //     Arrays.fill(row, 0);
        // }
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                dp[i][j]=0;
            }
        }
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
    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2= "abedg";
        System.out.println(longestCommonSubsequence(str1,str2));

    }
}

