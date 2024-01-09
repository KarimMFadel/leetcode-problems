package slidingWindow;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LongestSubstringWithoutRepeatingCharacters3 {
    
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        
        if(s.length() <= 1)
            return s.length();

        int length = 1, maxLength=0;
        int leftPointer = 0, rightPointer = 0;

        for (int i = 1; i < s.length(); i++)  {
            rightPointer++;
            int existIndex = checkStringContainChar(s.substring(leftPointer, rightPointer), s.charAt(i));
            if(existIndex<0) {
                length++;
            } else {
                // move the leftPointer to the index that have the same char that rightPointer stopped on it 
                length -= existIndex;
                leftPointer = leftPointer + existIndex + 1;
            }
            if(length > maxLength)
                maxLength = length;
        }

        return maxLength;
    }

    // this method return the index of the char inside the str that equal to C
    private static int checkStringContainChar(String str, char c) {
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }
}
