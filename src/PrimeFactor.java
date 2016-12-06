import java.util.ArrayList;

public class PrimeFactor {
//    public ArrayList<Integer> generatePrimeNumbers(int n) {
//        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
//
//        if (n < 2) {
//            return primeNumbers;
//        } else if (n)
//    }

    public boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> generate(int n) {
        ArrayList<Integer> output = new ArrayList<Integer>();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i) && n % i == 0) {
                output.add(i);
            }
        }

        return output;
    }
}
