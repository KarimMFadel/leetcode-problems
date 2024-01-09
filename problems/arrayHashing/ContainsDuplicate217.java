package arrayHashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        
    }

    public static boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length == 0)
            return false;
        Set<Integer> duplicateValues = new HashSet<>();
        for (int num : nums) {
            if(duplicateValues.contains(num))
                return true;
            duplicateValues.add(num);
        }
        return false;
    }

    public static boolean containsDuplicate_BadestTime(int[] nums) {
        Arrays.sort(nums);
        for (int i=0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1])
                return true;
        }

        return false;
    }

}
