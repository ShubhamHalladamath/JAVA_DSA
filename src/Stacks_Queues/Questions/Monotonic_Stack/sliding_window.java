package Stacks_Queues.Questions.Monotonic_Stack;
import java.util.*;
public class sliding_window {
    public static void main(String[] args) {
        int[] nums={1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(nums,3)));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        Stack<Integer> stack=new Stack<>();
        Deque<Integer> d1=new ArrayDeque<>();

        int temp=k;
        for(int i=0;i<=nums.length-k;i++){
            int max=Integer.MIN_VALUE;
            int j=i;
            while(k!=0){
                max=Math.max(nums[j],max);
                k--;
                j++;
            }

            stack.push(max);
            k=temp;

        }
        int[] ans=new int[stack.size()];
        int t=stack.size()-1;
        while(!stack.isEmpty()){
            ans[t]=stack.pop();
            t--;
        }
        return ans;
    }
}
