package Trees.rough;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}
public class r1 {
    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(2);
        root.left.left=new node(3);
        root.left.right=null;
        root.right.left=null;
        root.right.right=new node(3);
        root.right.right.left=new node(4);
        root.right.right.left.right=new node(4);
        int left=helper(root.left);
        int right=helper(root.right);
        System.out.println(Math.abs(left-right)<=1);

    }
    static int helper(node root){
        if(root==null){
            return 0;
        }
        int left= helper(root.left);
        int right=helper(root.right);
        return Math.max(left,right)+1;
    }
}
