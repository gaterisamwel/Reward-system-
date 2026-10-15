public class PerformanceComparison {
    public static void main(String[] args) {
        int n = 30;

        // Recursive
        long start = System.nanoTime();
        int recResult = RecursiveFibonacci.fib(n);
        long end = System.nanoTime();
        System.out.println("Recursive result: " + recResult);
        System.out.println("Recursive time: " + (end - start) + " ns");

        // Iterative
        start = System.nanoTime();
        int iterResult = FibonacciIterative.fib(n);
        end = System.nanoTime();
        System.out.println("Iterative result: " + iterResult);
        System.out.println("Iterative time: " + (end - start) + " ns");

        // Dynamic Programming
        start = System.nanoTime();
        int dpResult = FibonacciDP.fib(n);
        end = System.nanoTime();
        System.out.println("DP result: " + dpResult);
        System.out.println("DP time: " + (end - start) + " ns");
    }
}

