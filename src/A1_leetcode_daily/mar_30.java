package A1_leetcode_daily;
import java.util.*;
public class mar_30 {
    public static void main(String[] args) {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
    }
    public static List<Integer> partitionLabels(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        List<Integer> result=new ArrayList<>();
        for(int left=0;left<s.length();left++){
            int right=map.get(s.charAt(left));
            int maxRight=right;
            for(int i=left+1;i<maxRight;i++){
                int temp=map.get(s.charAt(i));
                maxRight=Math.max(temp,maxRight);
            }
            result.add(maxRight-left+1);
            left=maxRight+1;
        }
        return result;
    }
}
