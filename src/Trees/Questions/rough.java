package Trees.Questions;

import java.math.BigInteger;
import java.util.Deque;
import java.util.LinkedList;

public class rough {
    public static void main(String[] args) {
        System.out.println(good());
        Integer a=null;
    }
    public static boolean good() {
        Deque<Integer> helper=new LinkedList<>();
//        helper.addFirst(3);
//        helper.addLast(2);
        helper.addLast(-130);
        helper.addLast(-130);
//        helper.addLast(2);
//        helper.addLast(3);
        while(!helper.isEmpty()){
            System.out.println(helper);
            if(helper.peekFirst()!= helper.peekLast()){
                return false;
            }
            if(!helper.isEmpty()){
                helper.pollFirst();
            }
            if(!helper.isEmpty()){
                helper.pollLast();
            }
            System.out.println(helper);
        }
        return true;
    }
}
