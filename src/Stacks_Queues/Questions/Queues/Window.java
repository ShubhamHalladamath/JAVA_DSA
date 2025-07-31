package Stacks_Queues.Questions.Queues;
import java.util.*;

public class Window {
    public static void main(String[] args) {
        System.out.println(FirstNegativeInteger(new int[]{12, -1, -7, 8, -15, 30, 16, 28},3));
    }
    static List<Integer> FirstNegativeInteger(int arr[], int k) {
        List<Integer> list=new ArrayList<>();
        Deque<Integer> q1=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            q1.add(arr[i]);
        }
        int k1=k;
        while(!q1.isEmpty() && q1.size()>=k){
            while(k!=0 && !q1.isEmpty()){
                if(q1.peekFirst()<0) {
                    list.add(q1.peek());
                    st.push(q1.pop());
                    break;
                }else{
                 st.push(q1.pop());
                 k--;
                }
            }
            if(k!=0 && q1.isEmpty()){
                return list;
            }
            if(k==0){
                list.add(0);
            }

            k=k1;
            while(!st.isEmpty()){
                q1.addFirst(st.pop());
            }
            q1.removeFirst();

        }

        return list;
    }
}
