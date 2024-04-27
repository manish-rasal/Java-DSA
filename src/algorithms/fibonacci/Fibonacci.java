package algorithms.fibonacci;

public class Fibonacci {

    static Integer[] memo = new Integer[100];
    static int counter = 0;
    public static int fib(int n) {
        counter++;
        if(memo[n] != null) {
            return memo[n];
        }
        if(n == 0 || n == 1) {
            return n;
        }
        memo[n] = fib(n - 1) + fib(n - 2);
        return memo[n];
    }
    public static void main(String[] args) {
        System.out.println(fib(20));
        System.out.println(counter);
    }
}
