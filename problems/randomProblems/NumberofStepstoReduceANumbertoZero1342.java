package randomProblems;
class NumberofStepstoReduceANumbertoZero1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }

    public static int numberOfSteps(int num) {
        
        int steps = 0;
        while(num > 0) {
            if(num % 2 ==0) 
                num /= 2;
            else
                num -= 1;
            
            steps++;
        }
        return steps;
    }

}