package dynamicProgramming.FibonacciStyle;

import java.util.ArrayList;
import java.util.List;

public class MinCostClimbingStairs746 {
    public static void main(String[] args) {
        int[] nums = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(nums));
        System.out.println(minCostClimbingStairs_Recersion(nums, 0));
        System.out.println(minCostClimbingStairs_Recersion(nums, 1));


        // test(nums);
    }

    

    private static int minCostClimbingStairs(int[] cost) {
        List<Integer> memory = new ArrayList<>();
        
        int i = 2;
        while ( i < cost.length ) {

            if(cost[i-1] < cost[i-2]) {
                cost[i] += cost[i-1];
            } else {
                cost[i] += cost[i-2];
            }
            i += 1;
        }
        

        if(cost[i-1] < cost[i-2])
            return cost[i-1];
        else 
            return cost[i-2];
    }



    /// Wrong solution 
    public static int minCostClimbingStairs_badSolution(int[] cost) {
        int result = 0;
        int i = 0;
        while ( i < cost.length - 1) {
            if(i < cost.length - 2 && (cost[i] + cost[i+2] ) > cost[i+1]) {
                result += cost[i+1];
                i +=2;
            }else if(cost[i] < cost[i+1]) {
                result += cost[i];
                i += 1;
            } else {
                result += cost[i+1];
                i += 2;
            }
        }

        return result;
    }

    public static int minCostClimbingStairs_Recersion(int[] cost, int i) {
        if(i >= cost.length - 1)
            return 0;
            System.out.println("i " + i);
        if(cost[i] < cost[i+1])
            return cost[i] + minCostClimbingStairs_Recersion(cost, i+1);
        else 
            return cost[i+1] + minCostClimbingStairs_Recersion(cost, i+2);

    }
}
