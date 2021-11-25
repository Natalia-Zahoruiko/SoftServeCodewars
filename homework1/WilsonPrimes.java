/**
 * Wilson primes satisfy the following condition. Let P represent a prime number.
 *
 * Then ((P-1)! + 1) / (P * P) should give a whole number.
 *
 * Your task is to create a function that returns true if the given number is a Wilson prime.
 */
public class WilsonPrimes {

    public static boolean am_i_wilson(double n) {
        int[] primaries = {5, 13, 563};

        boolean result = false;

        for (int element : primaries) {
            int argument = (int) n;
            if (element == argument) {
                result = true;
                break;
            }
        }

        return result;
    }
}
