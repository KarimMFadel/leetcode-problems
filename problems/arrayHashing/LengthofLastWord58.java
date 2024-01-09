package arrayHashing;

public class LengthofLastWord58 {
    
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hello world"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    public static int lengthOfLastWord(String s) {
        boolean startedCount = false;
        int count = 0;
        for (int i = s.length() -1 ; i >= 0; i--) {
            if(s.charAt(i) != ' ') {
                count++;
                startedCount = true;
            } else if(startedCount){
                return count;
            }
        }

        return count;
    }

    public int lengthOfLastWord_oldSolution(String s) {
        String[] arrOfStr = s.trim().replaceAll(" +", " ").split(" ");
        return arrOfStr[arrOfStr.length-1].length();
    }
}
