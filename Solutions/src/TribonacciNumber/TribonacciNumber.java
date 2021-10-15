package TribonacciNumber;

/* For submission, replace classname with Solution in Leetcode.*/

public class TribonacciNumber {
    public int tribonacci(int n) {
        int[] cache = new int[n + 1];
        return helper(n, cache);
    }

    private int helper(int n, int[] cache) {
        if (cache[n] != 0) {
            return cache[n];
        }

        if (n <= 1) {
            return n;
        }

        if (n == 2) {
            return 1;
        }

        cache[n] = helper(n - 3, cache) + helper(n - 2, cache) + helper(n - 1, cache);
        return cache[n];
    }
}
