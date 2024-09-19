package prefixsum;

public class FindPivotIndex724 { // This question is the same as  (1991. Find the Middle Index in Array)
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int i : nums) {
            totalSum += i;
        }

        int left = 0; // Initialize the left sum
        // Iterate through the array 
        for (int i = 0; i < nums.length; i++) {
            int right = totalSum - left - nums[i]; // Calculate the right sum
            if (left == right) { // Check if left sum equals right sum
                return i; // Return  index
            }
            left += nums[i]; // Update the left sum
        }

        return -1;
    }

    public static void main(String[] args) {
        FindPivotIndex724 obj = new FindPivotIndex724();
        // obj.pivotIndex(new int[]{-1,-1,-1,-1,-1});
        // obj.pivotIndex(new int[]{-1,-1,-1,-1,-1,-1});
        // obj.pivotIndex(new int[]{1,7,3,6,5,6});
        // obj.pivotIndex(new int[]{1,2,3});
        // obj.pivotIndex(new int[]{2,1,-1});
        // obj.pivotIndex(new int[]{-1,-1,-1,-1,0,1});
        // obj.pivotIndex(new int[]{-1,-1,0,0,-1,-1});
        obj.pivotIndex(new int[]{-1,-1,0,1,-1,-1});
        // obj.pivotIndex(new int[]{-1,-1,-1,5,10,5,-1,-1,-1});
    }

}
