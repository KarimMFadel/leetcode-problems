package randomProblems;
public class RemoveElement27 {
    public static void main(String[] args) {
        int[] nums = {2,7};
        removeElement(nums,2);
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length;
        
        while(i < nums.length && j >= i) {
            if(nums[i] == val) {
                k--;
                if(nums[j] != val) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                    j--;
                } else {
                    nums[j] = 0;
                    j--;
                    continue;
                }
            }
            i++;
        }
        return k;
    }
}
