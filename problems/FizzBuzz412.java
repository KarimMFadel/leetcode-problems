package problems;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz412 {
    public static void main(String[] args) {
        fizzBuzz(10).forEach(s -> System.out.print(s));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            boolean isDividBy3 = (i % 3 == 0);
            boolean isDividBy5 = (i % 5 == 0);
            System.out.println("isDividBy3 : " + isDividBy3 + " isDividBy5 : " + isDividBy5);
            if(isDividBy3 && isDividBy5)
                result.add("FizzBuzz");
            else if (isDividBy3)
                result.add("Fizz");
            else if (isDividBy5)
                result.add("Buzz");
            else 
                result.add(new Integer(i).toString());
        }
        return result;
    }
}
