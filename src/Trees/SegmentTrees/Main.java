package Trees.SegmentTrees;

public class Main {
    public static void main(String[] args) {
        int[] arr={3,8,6,7,-2,-8,4,9};
        ST tree1=new ST(arr);
//        tree1.update(0,5);
        System.out.println(tree1.sum(1,6));
    }
}
