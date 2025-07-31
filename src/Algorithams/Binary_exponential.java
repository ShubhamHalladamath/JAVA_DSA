package Algorithams;

public class Binary_exponential {
    public static void main(String[] args) {
        System.out.println(power(298,10));
    }
    private static long power(long a, long b) {
        long result = 1;
        while (b > 0) {
            if ((b & 1) == 1) { // If b is odd
                result *= a;
            }
            a *= a;
            b >>= 1; // Equivalent to b /= 2
        }
        return result;
    }
}
