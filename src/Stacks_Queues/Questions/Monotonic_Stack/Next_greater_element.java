package Stacks_Queues.Questions.Monotonic_Stack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.Collections;
public class Next_greater_element {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{2,1,4},new int[]{1,2,3,4})));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> NGE=NGE(nums2);
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    ans[i]=NGE.get(j);
                    break;
                }
            }
        }
        return ans;
    }
    public static ArrayList<Integer> NGE(int[] arr){
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            if(st.isEmpty()){
                list.add(-1);
                st.push(arr[i]);

            }else{
                if(arr[i]<st.peek()){
                    list.add(st.peek());
                    st.push(arr[i]);

                }else{
                    while(!st.isEmpty() && arr[i]>st.peek()){
                        st.pop();
                    }
                    if(st.isEmpty()){
                        list.add(-1);
                        st.push(arr[i]);

                    }else{
                        list.add(st.peek());
                        st.push(arr[i]);
                    }

                }
            }
        }
        Collections.reverse(list);
        return list;
    }
}
