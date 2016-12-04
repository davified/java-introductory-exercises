import java.util.ArrayList;

public class FizzBuzz {
    public ArrayList<String> go(int n) {
        ArrayList<String> output = new ArrayList<String>();

        for (int i = 1; i <= n; i++) {
            String element;
            if (i % 15 == 0) {
                element = "FizzBuzz";
            } else if (i % 3 == 0) {
                element = "Fizz";
            } else if (i % 5 == 0) {
                element = "Buzz";
            } else {
                element = Integer.toString(i);
            }
            output.add(element);
        }
        System.out.println(output);
        return output;
    }
}
