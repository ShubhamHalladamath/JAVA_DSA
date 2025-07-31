package Stacks_Queues.Questions.Monotonic_Stack;
import java.util.*;
public class histogram {
    public static void main(String[] args) {
        int nums[] ={4,2,0,3,2,4,3,4};
        int[] a=NSE(nums);
        int[] b=PSE(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int temp=((a[i]-i)+(i-b[i]-1))*nums[i];
            System.out.println(sum+","+temp);
            sum=Math.max(temp,sum);
        }
        System.out.println(sum);
    }
    public static int[] NSE(int[] nums){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[nums.length] ;

        for(int i=nums.length-1;i>=0;i--){
           while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.pop();
            }

            if(st.isEmpty()){
                ans[i]=nums.length;
                st.push(i);
            }
            else{
                ans[i]=st.peek();
                st.push(i);
            }
        }
        return ans;
    }
    public static int[] PSE(int[] nums){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[nums.length] ;
        for(int i=0;i<nums.length;i++){
            if(!st.isEmpty() && nums[st.peek()]>nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
                st.push(i);
            }
            else{
                ans[i]=st.peek();
                st.push(i);
            }
        }
        return ans;
    }
}
