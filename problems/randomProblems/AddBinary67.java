package randomProblems;

import java.math.BigInteger;

public class AddBinary67 {
    
    public String addBinarySimpleSolution(String a, String b) { //SimpleSolution
        BigInteger n1 = new BigInteger(a,2);
        BigInteger n2 = new BigInteger(b,2);
        BigInteger num = n1.add(n2);
        return num.toString(2);
    }


    public String addBinary(String a, String b) {
        if (a.length() > b.length()) {
            int differentLength = a.length() - b.length();
            String paddedString = String.format("%0"+differentLength+"d", 0);
            b = paddedString + b;
        } else if (a.length() < b.length()) {
            int differentLength = b.length() - a.length();
            String paddedString = String.format("%0"+differentLength+"d", 0);
            a = paddedString + a;
        }

        char[] result = new char[a.length()+1];
        char remaining = '0';
        for (int i = a.length()-1; i >= 0; i--) {
            remaining = updateResult(result, i+1, b.charAt(i), a.charAt(i), remaining);
        }

        if (remaining == '1') {
            result[0] = '1';
            return String.valueOf(result);
        }
        return String.copyValueOf(result, 1, result.length-1);

    }

    public static void main(String[] args) {
        AddBinary67 obj = new AddBinary67();
        obj.addBinary("11", "1");
    }

    private char updateResult(char[] result, int index, char fChar, char sChar, char remaining) {
        if (fChar == '0' && fChar == sChar) {
            if (remaining == '1') {
                result[index] = '1';
                remaining = '0';
            } else {
                result[index] = '0';
                remaining = '0';
            }
        } else if (fChar == '1' && fChar == sChar) {
            if (remaining == '1') {
                result[index] = '1';
                remaining = '1';
            } else {
                result[index] = '0';
                remaining = '1';
            }
        } else {
            if (remaining == '1') {
                result[index] = '0';
                remaining = '1';
            } else {
                result[index] = '1';
                remaining = '0';
            }
        }
        return remaining;
    }
}
