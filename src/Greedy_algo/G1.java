package Greedy_algo;
import java.util.*;
class Solution {
    public int findContentChildren(int[] greed, int[] size) {
        Arrays.sort(greed);
        Arrays.sort(size);
        int i=0;
        int j=0;
        int ans=0;
        while(i<greed.length && j<size.length){
            if(greed[i]<=size[j]){
//                just move both the pointers;
                i++;
                j++;
                ans++;
            }else{
//              just move the size;
                j++;
            }
        }
        return ans;
    }
}
public class G1 {
    public static void main(String[] args) {
//        https://leetcode.com/problems/assign-cookies/


    }
}
