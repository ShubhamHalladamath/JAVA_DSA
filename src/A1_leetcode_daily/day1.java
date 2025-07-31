package A1_leetcode_daily;
import java.sql.SQLOutput;
import java.util.*;
public class day1 {
    public static void main(String[] args) {
        int[][] mat={{1,1},{0,0},{1,1},{1,1},{0,1},{0,0}};
        System.out.println(maxRemoval(new int[]{1,2},mat));
    }
    public static int maxRemoval(int[] nums, int[][] q) {
        int n=nums.length;
        Arrays.sort(q,(a,b)->Integer.compare(a[0],b[0]));
        PriorityQueue<Integer> available=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> used=new PriorityQueue<>((a,b)->Integer.compare(a,b));
        int ind=0;
        int qind=0;
        while(ind<n){
            while(qind<q.length && q[qind][0]==ind){
                available.add(q[qind++][1]);
            }
            while(!used.isEmpty() && used.peek() < ind){
                used.poll();
            }
            System.out.println(ind+"->"+available);
            System.out.println(ind+"->"+used);
            nums[ind]=nums[ind] - used.size();
            while(nums[ind]>0){
                if(available.isEmpty()){
                    return -1;
                }
                used.add(available.poll());
                nums[ind]--;
            }
            ind++;
        }
        return available.size();
    }
}
