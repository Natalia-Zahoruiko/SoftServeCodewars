/**
 * Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor.
 * First argument is an array of numbers and the second is the divisor.
 */
public class FindDivisibleNumbers {

    public static int[] divisibleBy(int[] numbers, int divider) {

        int[] divisibleNumbers = new int[]{};

        for (int element : numbers) {
            final boolean isDivisible = (element % divider) == 0;

            if (isDivisible) {
                int[] newArray = new int[divisibleNumbers.length + 1];
                System.arraycopy(divisibleNumbers, 0, newArray, 0, divisibleNumbers.length);
                newArray[newArray.length - 1] = element;
                divisibleNumbers = newArray;
            }
        }
        return divisibleNumbers;
    }


}
