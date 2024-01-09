package problems;

public class ValidParentheses20 {
    public static void main(String[] args) {
        System.out.println(isValid("()[]"));
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s) {
        int i = -1;
        char[] stack = new char[s.length()];
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')
                stack[++i] = ch;
            else {
                if (i >= 0
                    && ((stack[i] == '(' && ch == ')')
                        || (stack[i] == '{' && ch == '}')
                        || (stack[i] == '[' && ch == ']')))
                    i--;
                else
                    return false;
            }
        }
        return i == -1;
    }

    private boolean isValidFirstWay(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i<j) {
            System.out.println(" i " + s.charAt(i)  + " j " + s.charAt(j)  );
            if(s.charAt(i) == '(' && s.charAt(j) != ')')
                return false;
            if(s.charAt(i) == '[' && s.charAt(j) != ']')
                return false;
            if(s.charAt(i) == '{' && s.charAt(j) != '}')
                return false;
            i++;
            j--;
        } 
        return true;
    }
    
    private boolean isValidSecondWay(String s) {
        int sumRoundBrackets = 0, sumSquareBrackets = 0, sumCurlyBrackets = 0;
        for (char c : s.toCharArray()) {
            switch(c) {
            case '(':
                sumRoundBrackets += 1;
                break;
            case ')':
                sumRoundBrackets -= 1;
                break;
            case '{':
                sumCurlyBrackets += 1;
                break;
            case '}':
                sumCurlyBrackets -= 1;
                break;
            case '[':
                sumSquareBrackets += 1;
                break;
            case ']':
                sumSquareBrackets -= 1;
                break;
            }
        }
        if(sumRoundBrackets == 0 && sumSquareBrackets == 0 && sumCurlyBrackets == 0)
            return true;
        return false;
    }
}
