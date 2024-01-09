package dynamicProgramming.FibonacciStyle;

public class HouseRobber198 {
    public static void main(String[] args) {
        
    }

    public static int rob(int[] nums) {
    
        return max(nums, 0);
    }

    public static int max(int[] nums, int current) {
        System.out.println("current " + current );
        if(current >= nums.length - 2)
            return nums[current];
        System.out.println("nums[current] " + nums[current] + " nums[current + 1] " + nums[current + 1]);
        if(nums[current] >= nums[current + 1] )
            return nums[current] += max(nums, current + 2);
        else 
            return nums[current + 1] += max(nums, current + 3);
    }


}
