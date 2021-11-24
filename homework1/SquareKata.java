/**
 * Write a method, that will get an integer array as parameter and will process every number from this array.
 * Return a new array with processing every number of the input-array like this:
 * If the number has an integer square root, take this, otherwise square the number.
 * [4,3,9,7,2,1] -> [2,9,3,49,4,1]
 */
public class SquareKata {

    public static int[] squareOrSquareRoot(int[] array) {
        int[] processedNumbers = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double squareRoot = Math.sqrt(element);

            if ((squareRoot - Math.floor(squareRoot) == 0)) {
                processedNumbers[i] = new Double(squareRoot).intValue();
            } else {
                processedNumbers[i] = element * element;
            }
        }
        return processedNumbers;
    }
}
