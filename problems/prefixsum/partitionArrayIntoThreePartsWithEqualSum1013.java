package prefixsum;

public class partitionArrayIntoThreePartsWithEqualSum1013 {
    public boolean canThreePartsEqualSum(int[] nums) {
        int totalSum = 0;
        for (int i : nums) {
            totalSum += i;
        }

        if (totalSum % 3 != 0) return false;

        int firstMiddleIndex = -1;

        int left = 0; // Initialize the left sum
        // Iterate through the array 
        for (int i = 0; i < nums.length; i++) {
            left += nums[i]; // Update the left sum
            if ((totalSum / 3) == left) { // Check if (double left sum) equals right sum
                firstMiddleIndex = i;
                break;
            }
        }

        if (firstMiddleIndex == -1) return false;
        left = 0; // Initialize the left sum
        // Iterate through the array 
        for (int i = firstMiddleIndex+1; i < nums.length; i++) {
            left += nums[i]; // Update the left sum
            if (left == (totalSum / 3)) { // Check if left sum equals right sum
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        partitionArrayIntoThreePartsWithEqualSum1013 obj = new partitionArrayIntoThreePartsWithEqualSum1013();
        obj.canThreePartsEqualSum(new int[] {1,-1,1,-1} );
    }
}
