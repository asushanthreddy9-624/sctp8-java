public class Main {
    public static void main(String[] args) {
        // Create an array
        // - arrays are homogenus: int[] primes -> arrays of integers
        // new int[5] -> array of size 5
        int[] primes = new int[5];
        primes[0] = 1;
        primes[1] = 3;
        primes[2] = 5;
        primes[3] = 7;
        primes[4] = 11;
        System.out.println(primes[0] + primes[1]);

        int[] a = new int[]{1,2,3,4,5};
        System.out.println(a[4]);

        String[] names = new String[]{"Alan", "Alex", "Andy", "Amos"};
    }
}