package Dynamic_Programming.Memorization;

class Solution {
    int[] dp;
    int minCost(int[] height) {
        // code here
        dp=new int[height.length+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return helper(height,height.length-1);
    }
    // memorization top to bottom;
    int helper(int[] nums,int i){
        if(i==0){
            return 0;
        }

        if(dp[i]!=-1) return dp[i];

        int left=helper(nums,i-1)+Math.abs(nums[i]-nums[i-1]);

        int right=Integer.MAX_VALUE;
        if(i-2 >= 0){
            right =  helper(nums,i-2)+Math.abs(nums[i]-nums[i-2]);
        }

        return dp[i]=Math.min(left,right);
    }
//    tabulation bottom to top;
    public int helper2(int[] nums){
        int[] dp=new int[nums.length];
        dp[0]=0;
        for(int i=1;i<nums.length;i++){
            int left=dp[i-1]+Math.abs(nums[i]-nums[i-1]);
            int right=Integer.MAX_VALUE;
            if(i>1){
                right=dp[i-2]+Math.abs(nums[i]-nums[i-2]);
            }
            dp[i]=Math.min(left,right);
        }
        return dp[nums.length-1];
    }
//    for k jums
public int minimizeCost(int k, int nums[]) {
    // code here
    int n=nums.length;
    int[] dp=new int[n];
    dp[0]=0;
    for(int i=1;i<n;i++){
        int min=Integer.MAX_VALUE;
        int temp=1;
        while(temp<=k && (i-temp)>=0){
            int a=dp[i-temp]+Math.abs(nums[i]-nums[i-temp]);
            min=Math.min(min,a);
            temp++;
        }
        dp[i]=min;
    }
    return dp[n-1];
  }
}
public class Frog_jump {
    public static void main(String[] args) {
//         https://www.geeksforgeeks.org/problems/geek-jump/1?utm_source=youtube&utm_me
//         dium=collab_striver_ytdescription&utm_campaign=geek-jump
    }
}
