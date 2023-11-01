//https://www.codingninjas.com/studio/problems/count-derangements_873861?leftPanelTab=0

import java.util.Arrays;

/**
 * Countderangements
 */
public class Countderangements {
    public static long CD(int n, long dp[]){
			if(n==1){
			return 0;
		}
		if(n==2){
			return 1;
		}
		if(dp[n]!=-1){
			return dp[n];
		}
		dp[n] = (((n-1)%M)*((countDerangements(n-1)%M) +(countDerangements(n-2)%M))) %M ;
		return dp[n];
	}
	static long M = 1000000007;
	public static long countDerangements(int n) { 
		long dp [] = new long [n+1];
		 Arrays.fill(dp,-1);
		long ans= CD(n,dp);
		return ans;
	}

    public static void main(String[] args) {
        int n=4;
        System.out.println(countDerangements(n));

    }
}