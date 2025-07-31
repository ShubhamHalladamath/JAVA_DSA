package Trees.Questions.DFS_stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class pair{
    node n;
    int count;
    pair(node n,int count){
        this.n=n;
        this.count=count;
    }
}
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}

public class Single_traversal {
    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);
        Stack<pair> stack=new Stack<>();
        List<Integer> pre=new ArrayList<>();
        List<Integer> in=new ArrayList<>();
        List<Integer> post=new ArrayList<>();
        stack.push(new pair(root,1));
        while(!stack.isEmpty()){
            pair p=stack.pop();
            if(p.count==1){
                pre.add(p.n.val);
                p.count++;
                stack.push(p);
                if(p.n.left!=null){
                    stack.push(new pair(p.n.left,1));
                }
            }else if(p.count==2){
                in.add(p.n.val);
                p.count++;
                stack.push(p);
                if(p.n.right!=null){
                    stack.push(new pair(p.n.right,1));
                }
            }else{
                post.add(p.n.val);
            }
        }
        System.out.println("preorder->"+pre);
        System.out.println("Inorder->"+in);
        System.out.println("postorder->"+post);
    }
}
