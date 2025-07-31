package A1_leetcode_daily;
import java.util.*;
class Solution9 {
    public int minOperations(int[] nums) {
        int[][] sortednums=new int[nums.length][nums.length];
        for(int i=0;i<nums.length;i++){
            sortednums[i][0]=nums[i];
            sortednums[i][1]=i;
        }
        Arrays.sort(sortednums,(a,b)->Integer.compare(a[0],b[0]));


        int a=0;
        while(sortednums[a][0]==0){
            a++;
        }
        int value=sortednums[a][0];
        int count=1;
        int first=value;
        int ind=0;
        for(int i=a;i<nums.length;i++){
            if(first==sortednums[i][0]) continue;
            if(sortednums[i][0]==value && sortednums[i][1]!=ind+1){
                count++;
            }else if(sortednums[i][0]!=value){
                value=sortednums[i][0];
                count++;
            }
            ind=sortednums[i][1];
        }
        return count;
    }
}
public class rough {
    public static void main(String[] args) {
        Solution9 s=new Solution9();
        System.out.println(s.minOperations(new int[]{0,2}));
    }
}
