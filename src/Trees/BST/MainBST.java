package Trees.BST;

public class MainBST {
    public static void main(String[] args) {
        B1 b=new B1();
        b.insert(15);
        b.insert(10);
        b.insert(20);
        b.insert(7);
        b.insert(13);
        b.insert(18);
        b.insert(22);
        b.display();
        System.out.println("preorder--->");
        b.preOrder();
        System.out.println("postorder--->");
        b.postOrder();
        System.out.println("inorder--->");
        b.inOrder();
    }
}
