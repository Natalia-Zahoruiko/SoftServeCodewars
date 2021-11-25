/**
 * Given an array of integers.
 * Return an array, where the first element is the count of positives numbers
 * and the second element is sum of negative numbers.
 * If the input array is empty or null, return an empty array.
 */
public class CountOfPositivesSumOfNegatives {

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};
        }

        int[] result = new int[2];
        int count = 0;
        int sum = 0;
        for (int element : input) {
            if (element > 0) {
                count++;
            } else {
                sum = sum + element;
            }
        }

        result[0] = count;
        result[1] = sum;
        return result; //return an array with count of positives and sum of negatives
    }
}
