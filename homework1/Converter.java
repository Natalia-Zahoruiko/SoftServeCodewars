import java.text.DecimalFormat;

/**
 * Sometimes, I want to quickly be able to convert miles per imperial gallon into kilometers per liter.
 * Create an application that will display the number of kilometers per liter (output)
 * based on the number of miles per imperial gallon (input).
 * Make sure to round off the result to two decimal points. If the answer ends with a 0,
 * it should be rounded off without the 0. So instead of 5.50, we should get 5.5.
 * Some useful associations relevant to this kata: 1 Imperial Gallon = 4.54609188 litres 1 Mile = 1.609344 kilometres
 */
public class Converter {

    public static float mpgToKPM(final float mpg) {
        final float gallonToLitres = 4.54609188f;
        final float mileToKilometers = 1.609344f;

        float kilometres = mileToKilometers * mpg;
        float litters = gallonToLitres * mpg;
        float kilometersPerLiter = (kilometres / litters) * mpg;

        DecimalFormat dh = new DecimalFormat("0.0#");
        return Float.parseFloat(dh.format(kilometersPerLiter));
    }
}
