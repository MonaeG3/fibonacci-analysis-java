public class FibonacciAnalysis {

    // Recursive approach
    public static long fibRecursive(int n) {
        if (n <= 1) return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    // Dynamic Programming (Optimized)
    public static long fibDP(int n) {
        if (n <= 1) return n;

        long[] dp = new long[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;

        long start = System.nanoTime();
        long recursiveResult = fibRecursive(n);
        long end = System.nanoTime();
        System.out.println("Recursive Result: " + recursiveResult + 
                           " | Time: " + (end - start) + " ns");

        start = System.nanoTime();
        long dpResult = fibDP(n);
        end = System.nanoTime();
        System.out.println("DP Result: " + dpResult + 
                           " | Time: " + (end - start) + " ns");
    }
}
