package Stacks_Queues.Questions.Monotonic_Stack;
import java.util.*;
public class sliding_optimal {
    public static void main(String[] args) {
      int[] nums={7,2,4};
        System.out.println(maxSlidingWindow(nums,2));
    }
    public static ArrayList<Integer> maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> d1=new ArrayDeque<>();
        ArrayList<Integer> list=new ArrayList<>();
        int[] ans=new int[nums.length-k+1];
        int j=0;
        int temp=k;
        while(k!=0){
            while(!d1.isEmpty() && nums[j]>nums[d1.peekLast()]){
                d1.pollLast();
            }
            d1.addLast(j);
            j++;
            k--;
        }
        k=temp;
        for(int i=0;i<=nums.length-k;i++){
            if(d1.peekFirst()<i){
                d1.pollFirst();
            }
            list.add(nums[d1.peekFirst()]);


            if(i+k==nums.length){
                return list;
            }
            while(!d1.isEmpty() && nums[i+k]>nums[d1.peekLast()]){
                d1.pollLast();
            }

            d1.addLast(i+k);

        }


     return list;
    }


}
