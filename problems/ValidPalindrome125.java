package problems;
public class ValidPalindrome125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        s = s.trim().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int i = 0, j = s.length()-1;
        // StringBuilder sb = new StringBuilder(s);
        // sb = sb.reverse();

        // if(sb.toString().equals(s))
        //     return true;
        // return false;
        while(i<j) {
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
