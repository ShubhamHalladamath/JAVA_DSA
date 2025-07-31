package Trees.Binary_tree;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.*;
class node {
    int val;
    node left;
    node right;

    node(int val) {
        this.val = val;
    }

    node(int val, node left, node right) {
        this.left = left;
        this.val = val;
        this.right = right;
    }
}
class binary_tree{
    public static node root;
    public void populate(Scanner sc){
        System.out.println("Enter the root Node : ");
//        creating the root node
        int val=sc.nextInt();
        root=new node(val);
        populate(sc,root);
    }
    private void populate(Scanner sc,node root){
        System.out.println("Do you want to enter the node in left of node "+root.val+" : ");
        boolean left=sc.nextBoolean();
//        inserting in left if true
        if(left){
            System.out.println("enter the left node of "+root.val+" value");
            int val=sc.nextInt();
            root.left=new node(val);
//            reccursion call in left nodes
            populate(sc,root.left);
        }
        System.out.println("Do you want to enter the node in right of node "+root.val+" : ");
        boolean right=sc.nextBoolean();
//        inserting in right if true
        if(right){
            System.out.println("enter the right of "+root.val+" node value");
            int val=sc.nextInt();
            root.right=new node(val);
//            reccurssion calls in right
            populate(sc,root.right);
        }
    }
    void display(){
        Display(root,"");
    }
    void Display(node root,String temp){
        if(root==null){
            return;
        }
        System.out.println(temp+root.val);
        Display(root.left,temp+"\t");
        Display(root.right,temp+"\t");


    }
}
public class T1 {
    public static void main(String[] args) {
             binary_tree b1=new binary_tree();
        Stack<Integer> st=new Stack<>();
        String t="the";
        int[] arr={1,2,3,4};
        List<String> list=new ArrayList<>();
        String str="1,2,3,4,5";
        List<String> lt=Arrays.asList(str.split(","));
        System.out.println(lt);
    }
}
