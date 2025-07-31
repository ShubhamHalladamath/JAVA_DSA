package Stacks_Queues.Questions.Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class q1 {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>() ;
        Stack<Integer> s=new Stack<>();
        for (int i = 0; i <5 ; i++) {
            q.add(i);
        }
        System.out.println(q);
        while(!q.isEmpty()){
            s.push(q.poll());
        }
        System.out.println(s);
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        System.out.println(q);
    }
}
