package maths_dsa;

public class prime {
    public static void main(String[] args) {
        int n=40;
        for (int i = 0; i < n; i++) {
            if(prime(i)==true){
                System.out.println(i);
            }

        }
    }
    static boolean prime(int n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i <Math.sqrt(n); i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
