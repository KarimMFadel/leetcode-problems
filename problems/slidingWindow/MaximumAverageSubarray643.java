package slidingWindow;


public class MaximumAverageSubarray643 {

    public static double findMaxAverage(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE, sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxSum = sum;
        
        int startIndex = 0, endIndex = k;
        while (endIndex < nums.length) {
            sum = sum - nums[startIndex] + nums[endIndex]; 
            if(maxSum < sum)
                maxSum = sum;
            
            startIndex++;
            endIndex++;
        }

        return (double) maxSum/k;
    }

}