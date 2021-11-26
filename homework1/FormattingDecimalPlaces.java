import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Each number should be formatted that it is rounded to two decimal places.
 * You don't need to check whether the input is a valid number because only valid numbers are used in the tests.
 */
public class FormattingDecimalPlaces {

    public static double TwoDecimalPlaces(double number) {
        BigDecimal a = new BigDecimal(number);
        BigDecimal roundOff = a.setScale(2, RoundingMode.HALF_EVEN);
        return roundOff.doubleValue();
    }
}
