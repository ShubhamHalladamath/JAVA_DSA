package A1_leetcode_daily;
class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n=nums.length;
        int q=queries.length;
//        for(int i=0;i<q;i++){
//            if(checkWithDifferneceArray(nums,queries,i)){
//                return i+1;
//            }
//        }
//        return -1;
        int start=0;
        int end  =q-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(checkWithDifferneceArray(nums,queries,mid)){
                ans=mid+1;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }

    private boolean checkWithDifferneceArray(int[] nums, int[][] queries, int k) {
        int[] diff=new int[nums.length];
        for(int i=0;i<=k;i++){
            int start=queries[i][0];
            int end  =queries[i][1];
            int a    =queries[i][2];
            diff[start]+=a;
            if(end+1<nums.length) diff[end+1]-=a;
        }
        int currSum=0;
        for(int i=0;i<diff.length;i++){
            diff[i]=diff[i]+currSum;
            currSum=diff[i];
            if(nums[i]-diff[i]>0){
                return false;
            }
        }
        return true;
    }
}
public class mar_13 {
    public static void main(String[] args) {
            Solution s1=new Solution();
        System.out.println(s1.minZeroArray(new int[]{4,3,2,1},new int[][]{{1,3,2},{0,2,1}}));
    }
}
