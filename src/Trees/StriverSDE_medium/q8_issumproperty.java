package Trees.StriverSDE_medium;
class Solution8
{
    //Function to check whether all nodes of a tree have the value
    //equal to the sum of their child nodes.

    public  int isSumProperty(Node root)
    {
        Boolean ans=true;
        helper(root,ans);
        if(ans){
            return 1;
        }
        return 0;
    }

     Node helper(Node root,Boolean ans){
        if(root==null){
            return null;
        }
        if(root.left==null && root.right==null){
            return root;
        }
        Node left=helper(root.left,ans);
        Node right=helper(root.right,ans);
        int l=left!=null?left.data:0;
        int r=right!=null?right.data:0;
        ans=ans && (root.data==l+r);
        return root;
    }
}
public class q8_issumproperty {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(4);
        root.right=new Node(6);
        root.left.left=new Node(25);
        Solution8 s1=new Solution8();
        System.out.println(s1.isSumProperty(root));
    }
}
