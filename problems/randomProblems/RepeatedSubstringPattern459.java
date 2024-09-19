package randomProblems;

public class RepeatedSubstringPattern459 {
    public boolean repeatedSubstringPattern(String s) {

        if (s.length()==2 && s.charAt(0) == s.charAt(1) ) return true;

        int len = s.length();
        for (int i = 2; i < len; i++) {
            if (len % (len/i) != 0) continue;
            if( splitString(s,len, len/i)) return true;
        }

        return false;
        
    }

    public boolean splitString(String input, int len, int sublen) {
        String firstSubString = input.substring(0, sublen);

        for (int start = sublen; start < len; start += sublen) {
            String sub = input.substring(start, Math.min(start + sublen, len));
            if (!firstSubString.equalsIgnoreCase(sub)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        RepeatedSubstringPattern459 obj = new RepeatedSubstringPattern459();
        obj.repeatedSubstringPattern("bb");
    }
}
