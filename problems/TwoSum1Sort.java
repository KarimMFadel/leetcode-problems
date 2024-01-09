package problems;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1Sort {
    public static void main(String[] args) {
        int[] nums = {2,4,0,22,3,8,7,6};
        twoSum(nums,14);
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[] {numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[] {};
    }

}
