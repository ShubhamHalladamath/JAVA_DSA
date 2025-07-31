package Trees.Questions;
import java.util.*;
public class symmatric {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(-57);
        root.right=new TreeNode(-57);
        root.left.left=null;
        root.left.right=new TreeNode(67);
        root.right.left=new TreeNode(67);
        root.right.right=null;
        root.left.right.left=null;
        root.left.right.right=new TreeNode(-97);
        root.right.left.left=new TreeNode(-97);
        root.right.left.right=null;
        System.out.println(isSymmetric(root));

    }
    public static boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        Deque<Integer> helper=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode current=q.poll();
                if(current!=null){
                    helper.addLast(current.val*2);
                    if(current.left!=null){
                        q.add(current.left);
                    }else{
                        q.add(null);
                    }
                    if(current.right!=null){
                        q.add(current.right);
                    }else{
                        q.add(null);
                    }
                }
                else{
                    helper.addLast(null);
                }
            }
            System.out.println(helper);
            while(!helper.isEmpty()){

                if(helper.peekFirst()!= helper.peekLast()){
                    System.out.println(helper.peekFirst());
                     System.out.println(helper.peekLast());
                    return false;
                }
                if(!helper.isEmpty()){
                    helper.pollFirst();
                }
                if(!helper.isEmpty()){
                    helper.pollLast();
                }

            }
        }
        return true;
    }
}
