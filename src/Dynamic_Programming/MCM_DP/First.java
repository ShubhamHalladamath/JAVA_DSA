package Dynamic_Programming.MCM_DP;
import java.util.*;
// ABCDE matrix nums->{10,20,30,40,50} a=10*20,b=20*30 ,c=40*30 d=nums[i]*nums[i-1] i->(1,nums.length)
public class First {
    public static void main(String[] args) {
        
    }
    static int matrixMultiplication(int arr[]) {
        //
        int[][] dp=new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(arr,1,arr.length-1,dp);
    }



    private static int solve(int[] nums,int i,int j,int[][] dp){
        if(i==j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int min=(int)1e9;
        for(int k=i;k<j;k++){
            int steps=(nums[i-1] * nums[k] * nums[j]) + solve(nums,i,k,dp) + solve(nums,k+1,j,dp);
            min=Math.min(min,steps);
        }
        return dp[i][j]=min;
    }
}
