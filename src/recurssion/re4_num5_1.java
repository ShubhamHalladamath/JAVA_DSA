package recurssion;

public class re4_num5_1 {
    public static void main(String[] args) {
        n1(5);
        nrev(5);
    }
    static void n1(int n){
        if(n==1) {
            System.out.println(n);
            return;
        }
        n1(n-1);
        System.out.println(n);
    }
    static void nrev(int n){
        if(n==1) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        nrev(n-1);
    }
}
