package FibonacciNumber;

/* For submission, replace classname with Solution in Leetcode.*/

public class FibonacciNumber {
    public int fib(int n) {
        int[] cache = new int[n + 1];
        return helper(n, cache);
    }

    private int helper(int n, int[] cache) {
        if (cache[n] != 0) {
            return cache[n];
        }

        if (n <= 1) {
            return n;
        } else {
            cache[n] = helper(n - 1, cache) + helper(n - 2, cache);
            return cache[n];
        }
    }
}
