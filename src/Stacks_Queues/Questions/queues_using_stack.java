package Stacks_Queues.Questions;
import java.util.Stack;
class MyQueue {
    private Stack<Integer> first;
    private Stack<Integer> second;
    public MyQueue() {
        this.first=new Stack<>();
        this.second=new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed=second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked=second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }

    public boolean empty() {
        if(first.isEmpty()){
            return true;
        }
        return false;
    }
}
public class queues_using_stack {
    public static void main(String[] args) {
        MyQueue q1=new MyQueue();
        q1.push(1);
        q1.push(2);
        System.out.println(q1.pop());
        System.out.println(q1.pop());
        System.out.println(q1.empty());

    }
}
