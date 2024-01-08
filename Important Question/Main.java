import java.util.Scanner;

class Main {
   public  int lcs (char[] x ,char[] y, int m, int n){
        int dp[][] = new int[m+1][n+1];
        for(int i=0;i<=m;i++)
           for (int j= 0; j <= n; j++) {
                if(i==0 ||j==0){
                    dp[i][j]=0; 
                }
                else if(x[i-1]==y[j-1]){
                    dp[i][j]= dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
            return dp[m][n];
        }

    
    public static void main(String[] args) {
       Main ma = new Main();
       Scanner sc = new Scanner(System.in);
       String s1 = "aba";
       String s2 = "ababa";
        sc.close();
       char [] X =s1.toCharArray();
       char [] Y =s2.toCharArray();
       int m = X.length;
       int n = Y.length;
       System.out.println(ma.lcs(X, Y, m, n));
    }
}
