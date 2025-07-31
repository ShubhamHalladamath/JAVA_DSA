package HashMaps;
import java.util.*;
public class rough {
    public static void main(String[] args) {
        String s="aabcbaa";
        System.out.println(beautySum(s,5));
    }
    public static int beautySum(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                count=count+beauty(s.substring(i,j+1));
            }
        }
        return count;

    }
    public static int beauty(String s){
        Map<Character,Integer> mp=new HashMap<>();
        int max=-1;
        int min=-1;
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
            max=Math.max(max,mp.get(s.charAt(i)));
            min=Math.min(mp.get(s.charAt(0)),mp.get(s.charAt(i)));
        }
        return max-min;
    }
    public static int beautySum(String s,int a) {
//         FIRST APPROCH USING HASHMAPS
         int ans = 0;
         for(int i=0;i<s.length();i++){
             HashMap<Character,Integer> map = new HashMap<>();
             for(int j=i;j<s.length();j++){
                 if(map.containsKey(s.charAt(j))){
                     map.put(s.charAt(j),map.get(s.charAt(j))+1);
                 }else{
                     map.put(s.charAt(j),1);
                 }
             int largest = Integer.MIN_VALUE;
             int smallest= Integer.MAX_VALUE;
             for(int keys:map.values()){
                 if(keys>largest){
                     largest=keys;
                 }
                 if(keys<smallest){
                     smallest=keys;
                 }
             }
             ans+=(largest-smallest);
             }

         }
         return ans;
    }
    }
