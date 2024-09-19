package slidingWindow;

public class NumberofSubstringsContainingAllThreeCharacters1358 {

    public static int numberOfSubstrings(String s) {
        int countA = 0, countB = 0, countC = 0;
        int res = 0;
        int j = -1;

        countA += s.charAt(0) == 'a'? 1:0;
        countB += s.charAt(0) == 'b'? 1:0; 
        countC += s.charAt(0) == 'c'? 1:0;

        for (int i = 0; i < s.length()-2; i++) {

            if (countA > 0 && countB > 0 && countC > 0) {
                    res += (s.length()-j);
            } else {
                j = j != -1? j+1 : i+1;
                for (; j < s.length(); j++) {
                    countA += s.charAt(j) == 'a'? 1:0;
                    countB += s.charAt(j) == 'b'? 1:0; 
                    countC += s.charAt(j) == 'c'? 1:0;
                    if (countA > 0 && countB > 0 && countC > 0) {
                        res += (s.length()-j);
                        break;
                    }
                }
            }
            countA -= s.charAt(i) == 'a'? 1:0;
            countB -= s.charAt(i) == 'b'? 1:0; 
            countC -= s.charAt(i) == 'c'? 1:0;
        }

        return res;
    }

    public static void main(String[] args) {
        numberOfSubstrings("abc");
        numberOfSubstrings("aaacb");
        numberOfSubstrings("aaacb");
        numberOfSubstrings("aaaaaaaaaaaaaaaaaaaaaa");
        numberOfSubstrings("abcabc");
        
    }
}
