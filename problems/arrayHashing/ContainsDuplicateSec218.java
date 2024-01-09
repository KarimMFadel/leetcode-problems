package arrayHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainsDuplicateSec218 {
    public static void main(String[] args) {
    }

    public static boolean containsDuplicate(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return false;

        Map<Integer, Integer> duplicateValues = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            if(duplicateValues.containsKey(nums[i])){
                if(checkValues(duplicateValues.get(nums[i]), i, k))
                    return true;
                else
                    duplicateValues.put(nums[i], i);
            } else {
                duplicateValues.put(nums[i], i);
            }
        }
             
        return false;
    }

    public static boolean checkValues(int val1, int val2, int k) {
        if( Math.abs(val1 - val2) <= k)   
            return true;
        return false;
    }


    public static boolean containsDuplicate_oldSolution(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return false;

        Map<Integer, List<Integer>> duplicateValues = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            if(duplicateValues.containsKey(nums[i])){
                duplicateValues.get(nums[i]).add(i);
            } else {
                List<Integer> indices = new ArrayList<>();
                indices.add(i);
                duplicateValues.put(nums[i], indices);
            }
        }
        for (List<Integer> indices : duplicateValues.values()) {
            if(indices.size()<2)
                continue;
            
            for (int i=0; i < indices.size(); i++) {
                for (int j=i+1; j < indices.size(); j++) {
                    if( Math.abs(indices.get(i) - indices.get(j)) <= k) {
                        
                        return true;
                    }
                }
            }
        }
        return false;
    }


}
