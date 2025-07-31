package Dynamic_Programming.Memorization;
import java.util.*;
class Solution3 {
    TreeSet<Long> setAns;
    HashSet<String> setS;
    public long numberOfPowerfulInt(long start, long finish, int limit, String s) {

        setAns=new TreeSet<>();
        setS=new  HashSet<>();
        helper(start,finish,limit,s);

        return setAns.size();
    }
    private void helper(long start,long finish,int limit,String s){
        long temp=Long.parseLong(s);
        helper2(start,finish,limit,0+s);
        if(temp > finish || setS.contains(s)) return ;
        setS.add(s);
        if(temp>=start){
            setAns.add(temp);
        }

        for(int j=1;j<=limit;j++){
            helper(start,finish,limit,j+s);
        }
    }
    private void helper2(long start,long finish,int limit,String s){
        long temp=Long.parseLong(s);
        if(temp > finish || setS.contains(s)) return ;
        setS.add(s);
        if(temp>=start){
            setAns.add(temp);
        }
        for(int j=1;j<=limit;j++){
            helper2(start,finish,limit,j+s);
        }
    }

}
public class leetcode_daily {
    public static void main(String[] args) {
        Solution3 s=new Solution3();
        s.numberOfPowerfulInt(1,2000,8,"1");
        System.out.println(s.setAns.size());
        System.out.println(s.setAns);
    }
}
