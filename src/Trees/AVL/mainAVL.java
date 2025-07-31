package Trees.AVL;

public class mainAVL {
    public static void main(String[] args) {
        AVL_algo a1=new AVL_algo();
        a1.insert(1);
        a1.insert(2);
        a1.insert(3);
        a1.insert(4);
        a1.insert(5);
        a1.insert(6);
        a1.insert(0);
//        a1.insert(6);
//        a1.insert(7);

        a1.display();
        System.out.println(a1.balanced());
    }
}
