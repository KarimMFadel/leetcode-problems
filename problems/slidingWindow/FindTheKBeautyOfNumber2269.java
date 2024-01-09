package slidingWindow;

public class FindTheKBeautyOfNumber2269 {
    
    public static void main(String[] args) {
        /**
         * 32. Longest Valid Parentheses
         * 921. Minimum Add to Make Parentheses Valid
         * 670. Maximum Swap
         */
    }

    public static int divisorSubstrings(int num, int k) {
        
        int kBeauty = 0;
        int i=0, j=k;
        String strNum = Integer.toString(num);

        while(j <= strNum.length()) {
            int val = Integer.parseInt(strNum.substring(i, j));
            if(val != 0 && num % val == 0) {
                kBeauty ++;
            }
            i++;
            j++;
        }

        return kBeauty;
    }
}
