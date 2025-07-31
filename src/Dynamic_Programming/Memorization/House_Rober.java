package Dynamic_Programming.Memorization;
import java.util.*;
class Solution2 {
    int[] dp;
    public int rob(int[] nums) {
        dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return dfs(nums,0);
    }
    private int dfs(int[] nums,int i){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1) return dp[i];
        int left=nums[i]+dfs(nums,i+2);
        int right=dfs(nums,i+1);

        return dp[i]=Math.max(left,right);
    }
    private int Tabulation(int[] nums){
        int n=nums.length;
        int[] hash=new int[n];
        hash[0]=nums[0];
        for(int i=1;i<n;i++){
            int a=Integer.MIN_VALUE;
            if(i-2>=0){
                a=hash[i-2]+nums[i];
            }
            int b=hash[i-1];
            hash[i]=Math.max(a,b);
            hash[i]=Math.max(hash[i],nums[i]);
        }
        return hash[n-1];
    }
}
public class House_Rober {
    public static void main(String[] args) {

    }
}
