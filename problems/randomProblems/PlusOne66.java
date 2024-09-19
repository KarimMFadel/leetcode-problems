package randomProblems;

public class PlusOne66 {
    
    public int[] plusOne(int[] digits) {
        
        for (int i = digits.length-1; i >= 0; i--) {
            int val = digits[i] + 1;
            if (val < 10) {
                digits[i] = val;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newdigits = new int[digits.length+1];
        newdigits[0] = 1;
        for (int i = 0; i < digits.length; i++) {
            newdigits[i+1] = digits[i];
        }
        return newdigits;
    }

    public static void main(String[] args) {
        PlusOne66 obj = new PlusOne66();
        obj.plusOne(new int[] {9});
    }
}
