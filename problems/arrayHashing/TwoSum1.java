package arrayHashing;
public class TwoSum1 {
    public static void main(String[] args) {
        int[] nums = {2,7};
        twoSum(nums,9);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int [2];
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return null;
    }
}
