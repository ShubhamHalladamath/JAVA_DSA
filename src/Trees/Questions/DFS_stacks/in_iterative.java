package Trees.Questions.DFS_stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class in_iterative {
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
//        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
//        root.right.left = new node(6);
//        root.right.right = new node(7);
        Stack<node> st = new Stack<>();
        List<Integer> in = new ArrayList<>();
        node temp = root;
        while (true) {
            if (temp != null) {
                st.push(temp);
                temp = temp.left;
            } else {
                if(st.isEmpty()){
                    break;
                }
                temp = st.pop();
                in.add(temp.val);
                temp = temp.right;
            }

        }
        System.out.println(in);
    }
}
