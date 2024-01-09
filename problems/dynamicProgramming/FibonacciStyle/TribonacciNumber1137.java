package dynamicProgramming.FibonacciStyle;

public class TribonacciNumber1137 {
    public static void main(String[] args) {
        System.out.println(tribonacci(3));  // output : 2  T_3 = 0 + 1 + 1 = 2
        System.out.println(tribonacci(4));  // output : 4   T_4 = 1 + 1 + 2 = 4
        System.out.println(tribonacci(25)); // output : 1389537
    }

    public static int tribonacci(int n) {
        /* Declare an array to store Fibonacci numbers. */
        int f[] = new int[n+3]; // 1 extra to handle case, n = 0
        int i;
        
        /* 0th and 1st number of the series are 0 and 1*/
        f[0] = 0;
        f[1] = 1;
        f[2] = 1;
        
        for (i = 3; i <= n; i++)
        {
        /* Add the previous 2 numbers in the series
            and store it */
            f[i] = f[i-3] + f[i-2] + f[i-1];
        }
        
        return f[n];
    }
}
