package GRAPHS.DisJointSet;
import java.util.*;
class Solution {
    public boolean checkPowersOfThree(int n) {
        int temp=n;

        HashSet<Integer> set=new HashSet<>();
        while(temp!=0){
            int a=nearest(temp);
            if(set.contains(a)){
                return false;
            }else{
                temp=temp-(int)Math.pow(3,a);
                set.add(a);
            }
        }

        return true;
    }
    private int nearest(int n){
        int ans=0;
        for(int i=0;i<=Math.cbrt(n);i++){
            if(Math.pow(3,i)<=n){
                ans=i;
            }else{
                return ans;
            }
        }
        return ans;
    }
}
public class rough {
    public static void main(String[] args) {
        System.out.println(new Solution().checkPowersOfThree(27));
    }
}
