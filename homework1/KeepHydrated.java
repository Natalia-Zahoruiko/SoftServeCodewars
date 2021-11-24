public class KeepHydrated {

    public static int Liters(double time) {
        final double litersPerHour = 0.5;
        double result = time * litersPerHour;
        return (int) Math.floor(result);
    }
}
