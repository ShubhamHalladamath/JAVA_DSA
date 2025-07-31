package Dynamic_Programming.Memorization;

import java.util.Arrays;

public class DP1 {
    private static int fibbo(int n,int[] dp){
        if(n<=1){
            dp[n]=n;
            return n;
        }
        if(dp[n]!=-1) return dp[n];
        int ans=fibbo(n-1,dp)+fibbo(n-2,dp);
        dp[n]=ans;
        return ans;
    }
    public static void main(String[] args) {
        int[] dp=new int[50];
        Arrays.fill(dp,-1);
        System.out.println(fibbo(10,dp));
    }
}
