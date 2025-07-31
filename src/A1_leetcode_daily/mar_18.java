package A1_leetcode_daily;
import java.util.*;
class Solution2 {
    public int longestNiceSubarray(int[] nums) {
        int left  =0;
        int ans=1;
        for(int right=1;right<nums.length;right++){
            int temp=nums[left] & nums[right];
            if(temp!=0){
                left=right;
            }
            ans=Math.max(ans,right-left+1);
        }

        return ans;
    }
    public  int countSetBits(int n){
        int total=0;
        // Your code here
        for(int i=1;i<=n;i++){
            int cnt=0;
            while(i!=0){
                i = (i & (i-1));
                cnt++;
            }
            total+=cnt;
        }
        return total;
    }

        public int minOperations(int[] nums) {
            PriorityQueue<Integer> q=new PriorityQueue<>();
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    q.add(i);
                }
            }
            int cnt=0;
            while(!q.isEmpty()){
                int index=q.poll();
                if(nums[index]==0){
                    if(index + 3 > nums.length) return -1;
                    cnt++;
                    nums[index]= 1;
                    nums[index+1]= nums[index+1]^1;
                    nums[index+2]= nums[index+2]^1;
                    if(nums[index+1]==0) q.add(index+1);
                    if(nums[index+2]==0) q.add(index+2);
                }
            }
            return cnt;
        }
    }

public class mar_18 {
    public static void main(String[] args) {
        Solution2 s=new Solution2();
        int[] arr={744437702,379056602,145555074,392756761,560864007,934981918,113312475,1090,16384,33,217313281,117883195,978927664};
        int[] nums={0,1,1,1,0,0};
        System.out.println(s.minOperations(nums));
    }
}
