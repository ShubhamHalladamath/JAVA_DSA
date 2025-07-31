package Stacks_Queues.Questions.Monotonic_Stack;
import java.util.Stack;
import java.util.Arrays;

public class maximum_subbarray_sum {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        System.out.println(smallest(nums));
    }
    public static int smallest(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] ans1=new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            while(!st.isEmpty() &&  arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans1[i]=arr.length;
                st.push(i);
            }else{
                ans1[i]=st.peek();
                st.push(i);
            }
        }
        Stack<Integer> str=new Stack<>();
        int[] ans2=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            while(!str.isEmpty() &&  arr[str.peek()]>arr[i]){
                str.pop();
            }
            if(str.isEmpty()){
                ans2[i]=-1;
                str.push(i);
            }else{
                ans2[i]=str.peek();
                str.push(i);
            }
        }
        int MOD = 1_000_000_007;
        int flag=0;
        for(int i=0;i<arr.length;i++){
            flag=(flag+((i-ans2[i])*(ans1[i]-i)*arr[i]))%MOD;

        }
        return (int)flag;
    }
    public static int largest(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] ans1=new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            while(!st.isEmpty() &&  arr[st.peek()]<arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans1[i]=arr.length;
                st.push(i);
            }else{
                ans1[i]=st.peek();
                st.push(i);
            }
        }
        Stack<Integer> str=new Stack<>();
        int[] ans2=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            while(!str.isEmpty() &&  arr[str.peek()]<=arr[i]){
                str.pop();
            }
            if(str.isEmpty()){
                ans2[i]=arr.length;
                str.push(i);
            }else{
                ans2[i]=str.peek();
                str.push(i);
            }
        }
        int MOD = 1_000_000_007;
        int flag=0;
        for(int i=0;i<arr.length;i++){
            flag=(flag+((i-ans2[i])*(ans1[i]-i)*arr[i]))%MOD;

        }
        return (int)flag;
    }
}
