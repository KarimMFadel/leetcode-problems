package randomProblems;
public class MinimumMovestoReachTargetScore2139 {
    public static void main(String[] args) {
        System.out.println(minMoves(19,2));
    }

    public static int minMoves(int target, int maxDoubles) {
        int steps = 0;
        while(target > 1) {
            if(maxDoubles == 0)
                return target - 1 + steps;
            
            if(target % 2 == 0 && maxDoubles > 0) { 
                target /= 2;
                maxDoubles--;
            } else {
                target -= 1;
            }
            steps++;
        }
        return steps;
    }
}
