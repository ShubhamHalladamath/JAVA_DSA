package Trees.Questions.DFS_stacks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class pre_iterative {
    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);
        Stack<node> stack=new Stack<>();
        stack.push(root);
        List<Integer> pre=new ArrayList<>();

        while(!stack.isEmpty()){
                node current=stack.pop();
                pre.add(current.val);
                if(current.right!=null){
                    stack.add(current.right);
                }
                if(current.left!=null){
                    stack.add(current.left);
                }
            }

        System.out.println(pre);
    }
}
