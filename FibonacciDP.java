 public class FibonacciDP {
    public static int fib(int n) {
        if (n <= 1) return n;

        int[] dp = new int[n + 1]; // array to store results
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]; // build from bottom up
        }

        return dp[n]; // nth Fibonacci number
    }

    public static void main(String[] args) {
        int n = 10; // example
        System.out.println("Fibonacci series using DP:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
