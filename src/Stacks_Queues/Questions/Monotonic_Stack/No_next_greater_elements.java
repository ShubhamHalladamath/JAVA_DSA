package Stacks_Queues.Questions.Monotonic_Stack;

import java.util.Arrays;
import java.util.Stack;

class Pair{
    int a;
    int b;
    Pair(int a,int b){
        this.a=a;
        this.b=b;
    }
}
public class No_next_greater_elements {
    public static void main(String[] args) {
        int[] nums={3,1,2,4};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(NSE(nums)));
        System.out.println(Arrays.toString(PSE(nums)));
        for(int i=0;i<nums.length;i++){

        }
    }
    public static int[] NGES(int[] arr){
        Stack<Pair> temp=new Stack<>();
        int[] ans=new int[arr.length];
        int count=0;
        for (int i = arr.length-1; i >=0 ; i--) {
            if(temp.isEmpty()){
                ans[i]=count;
                temp.push(new Pair(arr[i],++count));

            }else{
                if(temp.peek().a>arr[i]){
                    ans[i]=temp.peek().b;
                    temp.push(new Pair(arr[i],++count));
                }else{
                    while(!temp.isEmpty() && temp.peek().a<arr[i]){
                        temp.pop();
                        count--;
                    }

                    if(temp.isEmpty()){
                        ans[i]=count;
                        temp.push(new Pair(arr[i],++count));
                    }else{
                        ans[i]=temp.peek().b;
                        temp.push(new Pair(arr[i],++count));
                    }
                }
            }

        }



        return ans;
    }
    public static int[] NGES(int[] arr,int n) {
        Stack<Integer> stack = new Stack<>(); // Stack to store elements
        int[] ans = new int[arr.length]; // Array to store the result

        for (int i = arr.length - 1; i >= 0; i--) {
            // Remove all elements smaller than or equal to the current element
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // The count of elements left in the stack gives the result
            if(stack.isEmpty()) {
                ans[i] = -1;
            stack.push(arr[i]);}

            // Push the current element onto the stack
            else {
                ans[i]=stack.peek();
                stack.push(arr[i]);}
        }

        return ans;
    }
    public static int[] solve(int[] arr) {
        int n = arr.length;
        int[] ngeCounts = new int[n]; // Stores count of elements strictly greater to the right
        Stack<Integer> stack = new Stack<>(); // Stack to maintain a monotonic decreasing order

        // Precompute counts using monotonic stack
        for (int i = n - 1; i >= 0; i--) {
            // Remove elements from stack that are less than or equal to current element
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }

            // Remaining elements in the stack are strictly greater than arr[i]
            ngeCounts[i] = stack.size();

            // Push the current index onto the stack
            stack.push(i);
        }


        return ngeCounts;
    }
    public static int[] NSE(int[] arr){
        Stack<Pair> st=new Stack<>();
        int[] ans=new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            while(!st.isEmpty() &&  st.peek().a>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=arr.length;
                st.push(new Pair(arr[i],i));
            }else{
                ans[i]=st.peek().b;
                st.push(new Pair(arr[i],i));
            }
        }
        return ans;
    }
    public static int[] PSE(int[] arr){
        Stack<Pair> st=new Stack<>();
        int[] ans=new int[arr.length];
        for (int i = 0; i<arr.length;i++) {
            while(!st.isEmpty() &&  st.peek().a>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
                st.push(new Pair(arr[i],i));
            }else{
                ans[i]=st.peek().b;
                st.push(new Pair(arr[i],i));
            }
        }
        return ans;
    }

}
