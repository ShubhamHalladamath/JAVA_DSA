package Dynamic_Programming.Memorization;
import java.util.*;
class Solution5 {
    public static int minSubsetSumDifference(int []arr, int n) {
        // Write your code here.
        int sum=0;
        for(int i:arr) sum+=i;
        boolean[][] dp=new boolean[n][sum+1];
        for(int i=0;i<n;i++) dp[i][0]=true;
        dp[0][arr[0]]=true;
        for(int i=1;i<n;i++){
            for(int j=1;j<sum+1;j++){
                boolean notpick=dp[i-1][j];
                boolean pick=false;
                if(j>=arr[i]){
                    pick=dp[i-1][j-arr[i]];
                }
                dp[i][j]=pick || notpick;
            }
        }
        int min=(int)1e9;
        for(int j=0;j<sum+1;j++){
            if(dp[n-1][j]){
                int sum1=j;
                int sum2=sum-sum1;
                int diff=Math.abs(sum2-sum1);
                min=Math.min(min,diff);
            }
        }
        return min;
    }
}
public class Array_partition_with_minimum_difference {
    public static void main(String[] args) {
//https://www.naukri.com/code360/problems/partition-a-set-into-two-subsets-such-that-the-difference-of-subset-sums-is-minimum_842494?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos&leftPanelTab=0&leftPanelTabValue=PROBLEM
    }
}
