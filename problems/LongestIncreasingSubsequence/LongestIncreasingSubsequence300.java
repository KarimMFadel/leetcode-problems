package LongestIncreasingSubsequence;

public class LongestIncreasingSubsequence300 {
    public static void main(String[] args) {
        
    }

    public static int lengthOfLIS(int[] nums) {
        int maxLength = 0, length = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] < nums[i+1]) {
                length++;
            } else {
                if(maxLength < length)
                    maxLength = length;
                length = 1;
            }
        }
        
        return maxLength;
    }
}
