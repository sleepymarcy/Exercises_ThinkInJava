package tij.exercises;

import java.util.Arrays;

public class Chapter7 {
    Chapter7() {
    }

    public static boolean isAnagramWithSort(String first, String second) {
        first = first.toLowerCase();
        second = second.toLowerCase();

        if (first.length() == second.length()) {
            char[] arrFirst = first.toCharArray();
            char[] arrSecond = second.toCharArray();

            Arrays.sort(arrFirst);
            Arrays.sort(arrSecond);

            return Arrays.equals(arrFirst, arrSecond);
        } else {
            return false;
        }
    }

    // using letterHist
    public static boolean isAnagram(String first, String second) {
        if (first.length() == second.length()) {
            int[] histFirst = letterHist(first);
            int[] histSecond = letterHist(second);

            return Arrays.equals(histFirst, histSecond);
        } else {
            return false;
        }
    }

    public static int[] letterHist(String word) {
        int[] counts = new int[256];
        char[] letters = word.toLowerCase().toCharArray();
        // for (int i = 0; i < lower.length(); i++) {
        for (char letter : letters) {
            // counts[letters[i]]++;
            counts[letter]++;
        }
        return counts;
    }

    public static boolean arePrimeFactors(int n, int[] arr) {
        for (int el : arr) {
            if (!isPrime(el)) {
                return false;
            }
        }
        return areFactors(n, arr);
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n < 4) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
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

    public static boolean areFactors(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % n != 0) {
                return false;
            }
        }
        return true;
    }

    public static int maxElement(int[] arr) {
        int max = arr[0];
        for (int el : arr) {
            if (el >= max) {
                max = el;
            }
        }
        return max;
    }

    public static int indexOf(int element, int[] arr) {
        int i = 0;
        for (int el : arr) {
            if (el == element)
                break;
            i++;
        }
        return i;
    }

    public static int indexOfMax(int[] arr) {
        return indexOf(maxElement(arr), arr);
    }

}
