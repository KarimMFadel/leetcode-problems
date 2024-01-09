package arrayHashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateThird220 {
    public static void main(String[] args) {
        
    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        Set<Integer> repeatedValues = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(repeatedValues.contains(nums[i]) && valueDiff != 0)
                continue;

            repeatedValues.add(nums[i]);

            for (int j = i+indexDiff; j < nums.length; j++) {
                if(Math.abs(i-j) <= indexDiff && Math.abs(nums[i]-nums[j]) <= valueDiff)
                    return true;
            }
        }
        return false;
    }
}
