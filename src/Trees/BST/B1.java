package Trees.BST;

import java.util.Stack;

class node{
    int val;
    int height;
    node left;
    node right;
    node(int val){
        this.val=val;
        this.height=-1;
    }
}
public class B1 {
    private node root;


    public void insert(int val){
        root=insert(val,root);
    }
    private node insert(int val,node n){
        if(n==null){
            n=new node(val);
            n.height=Math.max(getHeight(n.left),getHeight(n.right))+1;
            return n;
        }
        if(val<n.val){
            n.left= insert(val,n.left);
        }
        if(val>n.val){
            n.right=insert(val,n.right);
        }
        n.height=Math.max(getHeight(n.left),getHeight(n.right))+1;
        return n;
    }
    int heightOfTree(){
        return root.height;
    }
    int getHeight(node root){
        if(root==null){
            return -1;
        }
        return root.height;
    }
    void display(){
        Display(root,"","root->");
    }
    void Display(node root, String temp,String dum){
        if(root==null){
            return;
        }
        System.out.println(temp+dum+root.val);
        Display(root.left,temp+"\t","Left node of "+root.val+" :->");
        Display(root.right,temp+"\t","Right node of "+root.val+" :->");
    }
    boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(node root){
        if(root==null){
            return true;
        }
        return Math.abs(getHeight(root.left)-getHeight(root.right))<=1 && balanced(root.left) && balanced(root.right);
    }
    void preOrder(){
        preOrder(root);
        System.out.println("end");
    }
    private void preOrder(node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+"->");
        preOrder(root.left);
        preOrder(root.right);
    }
    void postOrder(){
        postOrder(root);
        System.out.println("end");
    }
    private void postOrder(node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+"->");
    }
    void inOrder(){
        inOrder(root);
        System.out.println("end");
    }
    private void inOrder(node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+"->");
        inOrder(root.right);
    }
}
