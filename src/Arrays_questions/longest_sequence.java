package Arrays_questions;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Arrays;
public class longest_sequence {
    public static void main(String[] args) {
        int[] arr={102,4,100,5,101,3,2,1,103,104,105,106};
        int[][] mat={{1,4,2},{1,9},{0,8}};
        Arrays.sort(mat,(a,b)->Integer.compare(a[0],b[1]));
        System.out.println();

    }
}
