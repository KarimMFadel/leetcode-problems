package randomProblems;
public class PalindromeNumber9 {
    
    public static void main(String[] args) {
        System.out.println(isPalindrome_BestSolution(121));
        System.out.println(isPalindrome_BestSolution(13231));
    }

    public static boolean isPalindrome_BestSolution(int x) {
        if(x < 0) return  false; 
        int reversed = 0, remainder, original = x;
        while(x != 0) {
            remainder = x % 10; // reversed integer is stored in variable
            reversed = reversed * 10 + remainder; //multiply reversed by 10 then add the remainder so it gets stored at next decimal place.
            x  /= 10;  //the last digit is removed from num after division by 10.
            System.out.println("remainder "+ remainder + " reversed " + reversed + "  num " + x);
        }
        // palindrome if original and reversed are equal
        return original == reversed;
    }

    public static boolean isPalindrome_badSoutiion(int x) {
        
        String value = Integer.toString(x);
        StringBuilder reversedValue = new StringBuilder(value);
        if(reversedValue.reverse().toString().equals(value ))
            return true;

        return false;
    }

    public static boolean isPalindrome(int x) {
        
        String value = String.valueOf(x);
        int start = 0, end = value.length();

        while(start < end) {
            if(value.charAt(start) != value.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }
}
