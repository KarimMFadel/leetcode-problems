package dynamicProgramming.FibonacciStyle;

public class ClimbingStairs70 {

    public static void main(String[] args) {
        System.out.println(climbStairs(25));
    }
    
    public static int climbStairs(int n) {
        /* Declare an array to store Fibonacci numbers. */
        int f[] = new int[n+2]; // 1 extra to handle case, n = 0
        int i;
        
        /* 0th and 1st number of the series are 0 and 1*/
        f[0] = 1;
        f[1] = 1;
        
        for (i = 2; i <= n; i++)
        {
        /* Add the previous 2 numbers in the series
            and store it */
            f[i] = f[i-1] + f[i-2];
        }
        
        return f[n];
    }

    private static int getFibonacci(int n) {
        if(n <= 1)
            return 1;

        return getFibonacci(n-1) + getFibonacci(n-2); 
    }
}
