package problems;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> storage = new HashMap<>();
        storage.put('I',1);
        storage.put('V',5);
        storage.put('X',10);
        storage.put('L',50);
        storage.put('C',100);
        storage.put('D',500);
        storage.put('M',1000);

        int result = 0;

        if(s.length() == 2) {
            if(check2Chars(storage, s.charAt(0), s.charAt(1)))
                return storage.get(s.charAt(1)) - storage.get(s.charAt(0));
        }
        int i = 0;
        while(i < s.length()) {
            if( i+1 != s.length() && check2Chars(storage, s.charAt(i), s.charAt(i+1))) {
                System.out.println(s.charAt(i+1) + " - " + s.charAt(i));
                result += storage.get(s.charAt(i+1)) - storage.get(s.charAt(i));
                i += 2;
            } else {
                System.out.println(s.charAt(i));
                result += storage.get(s.charAt(i));
                i += 1;
            }
            System.out.println(result);
        }
        return result;
    }
    private static boolean check2Chars(Map<Character, Integer> storage, char firstChar, char secondChar) {
        if(storage.get(firstChar) < storage.get(secondChar) )
            return true;
        return false;
    }
}