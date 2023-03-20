/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the nth prime number?
 */
public class NthPrimeNumber {
    public static void main(String[] args) {
        System.out.println(nthPrimeNumber(6));
    }

    public static int nthPrimeNumber(int n) {
        int count = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                count++;
            }
            i++;
        }
        return i - 1;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
