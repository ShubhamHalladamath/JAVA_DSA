package A1_leetcode_daily;
import java.util.*;
public class april_3 {
    public static void main(String[] args) {
        int[][] intervals={{1,100},{11,22},{1,11},{2,12}};
        Arrays.sort(intervals, (a, b) -> {

            return Integer.compare(a[1], b[1]);
        });
        for(int[] i:intervals){
            System.out.println(Arrays.toString(i));
        }
        int prevEnd=Integer.MIN_VALUE;
        int count=0;
        for(int[] i:intervals){
            int left=i[0];
            int right=i[1];
            if(left<prevEnd){
                count++;
            }
            prevEnd=right;
        }
        System.out.println(count);
    }

}
