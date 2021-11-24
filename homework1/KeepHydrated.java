/**
 * Nathan loves cycling.
 * Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
 * You get given the time in hours and you need to return the number of litres Nathan will drink,
 * rounded to the smallest value.
 */
public class KeepHydrated {

    public static int Liters(double time) {
        final double litersPerHour = 0.5;
        double result = time * litersPerHour;
        return (int) Math.floor(result);
    }
}
