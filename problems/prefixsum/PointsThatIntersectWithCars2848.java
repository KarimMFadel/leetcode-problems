package prefixsum;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PointsThatIntersectWithCars2848 {
    
    public static int numberOfPoints(List<List<Integer>> nums) {

        // Sort the list based on the first element of each sublist
        Collections.sort(nums, (list1, list2) -> list1.get(0).compareTo(list2.get(0)));
        // merge the lists
        for (int i = 0; i < nums.size()-1; i++) {
            int startValOfElement = nums.get(i).get(0);
            int endValOfElement = nums.get(i).get(1);
            int startValOfNextElement = nums.get(i+1).get(0);
            int endValOfNextElement = nums.get(i+1).get(1);

            if (startValOfNextElement <= endValOfElement) {

                if (startValOfElement <= startValOfNextElement) {
                    nums.get(i+1).set(0, startValOfElement);
                } 
                
                if (endValOfElement > endValOfNextElement) {
                    nums.get(i+1).set(1, endValOfElement);
                }

                nums.get(i).set(0, 0);
                nums.get(i).set(1, 0);
            }
        }

        // calculatePoints
        int points = 0;
        for (List<Integer> list : nums) {
            if (list.get(1) == 0)
                continue;
            points = points + list.get(1) - list.get(0) + 1;
        }

        return points;
    }


     public int numberOfPointsCopiedSolution(List<List<Integer>> nums) {  // best solution 
        Set<Integer> points = new HashSet<>();

        for (List<Integer> pair : nums) {
            for (int i = pair.get(0); i <= pair.get(1); i++) {
                points.add(i);
            }
        }

        return points.size();
    }

    public static void main(String[] args) {
        numberOfPoints(Arrays.asList(
            Arrays.asList(1, 3),
            Arrays.asList(5, 8)
        ));
    }
}
