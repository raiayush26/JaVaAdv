//https://www.codingninjas.com/studio/problems/ninja-and-the-fence_3210208?topList=love-babbar-dsa-sheet-problems&leftPanelTab=0

import java.util.Arrays;

/**
 * NinjaAndTheFence
 */
public class NinjaAndTheFence {
     static long M = 1000000007;

   public static int add(int a, int b) {
    return (int) ((a % M + b % M) % M);
}

public static int mul(int a, int b) {
    return (int) ((a % M) * (b % M) % M);
}

    public static int sol(int n, int k,int []dp ) {
        if (n == 1) {
            return k;
        }
        if (n == 2) {
            return add(k,mul(k, k-1));
        }
        if(dp[n]!= -1){
            return dp[n];
        }
        //int c=mul(sol(n-2,k,dp),k-1);
        //int d=mul(sol(n-1,k,dp),k-1);

       dp[n] = add(mul(sol(n-2,k,dp),k-1),mul(sol(n-1,k,dp),k-1));
        return dp[n];
    }

    public static int numberOfWays(int n, int k) {
        int dp[] = new int[n+1];
         Arrays.fill(dp,-1);
        return sol(n, k,dp);
    }

    public static void main(String[] args) {
        int n= 3 ;
        int k=2;
        System.out.println( numberOfWays(n,k));
    }
}