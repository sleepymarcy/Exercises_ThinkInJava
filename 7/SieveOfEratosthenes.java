public class SieveOfEratosthenes {
    public static void main(String[] args) {
        boolean[] lista = sieve(1100000);

        for (int i = 0; i < lista.length; i++) {
            System.out.println(i + ".isPrime: " + lista[i]);
        }
    }

    public static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n];

        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        isPrime[0] = false;
        isPrime[1] = false;

        for (int num = 2; num <= Math.sqrt(n); num++) {
            for (int i = num + 1; i < n; i++) {
                if (isPrime[i] && i % num == 0) {
                    isPrime[i] = false;
                }
            }
        }

        return isPrime;
    }
}
