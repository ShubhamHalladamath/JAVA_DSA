package Stacks_Queues.Questions;
import java.util.ArrayList;
import java.util.List;
public class two_stack_game {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        System.out.println( twoStacks(5,a,b));
    }
    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        // Write your code here
        return remove(maxSum,a,b,0,0)-1;
    }
    static int remove(int ms,List<Integer> a, List<Integer> b,int sumcurr,int count){
        if(sumcurr>ms){
            return count;
        }
        if(a.size()==0 || b.size()==0){
            return count;
        }
        int left=remove(ms,a.subList(1,a.size()),b,sumcurr+a.get(0),count+1);
        int right=remove(ms,a,b.subList(1,b.size()),sumcurr+b.get(0),count+1);
        return Math.max(left,right);
    }

}

