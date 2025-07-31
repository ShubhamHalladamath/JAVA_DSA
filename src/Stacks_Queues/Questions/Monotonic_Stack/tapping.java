package Stacks_Queues.Questions.Monotonic_Stack;
import java.util.*;
public class tapping {
    public static void main(String[] args) {

        int[] nums={4,2,3};
       Queue<Integer> q1=new LinkedList<>();

        int sum=0;
        int[] NGE=NGEE(nums);
        int[] PGE=PGE(nums);
        System.out.println(Arrays.toString(NGE));
        System.out.println(Arrays.toString(PGE));

        for(int i=0;i<nums.length;i++){
            if(PGE[i]==nums[i] || NGE[i]==nums[i]){

            }else{
                int demo=Math.min(PGE[i],NGE[i]);
                demo=demo-nums[i];
                sum=sum+demo;
            }
        }
        System.out.println(sum);
    }
    public static int[] NGEE(int[] nums){
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            while(!stack.isEmpty() && nums[i]>stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=nums[i];
                stack.push(nums[i]);
            }else{
                ans[i]=stack.peek();
                stack.push(ans[i]);
            }
        }
        return ans;
    }
    public static int[] PGE(int[] nums){
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[i]>stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=nums[i];
                stack.push(nums[i]);
            }else{
                ans[i]=stack.peek();
                stack.push(ans[i]);
            }
        }
        return ans;
    }
}
