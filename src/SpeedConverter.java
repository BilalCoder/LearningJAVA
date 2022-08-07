public class SpeedConverter {
    //This is the udemy code excercise
    public static long toMilesPerHour(double kilometersPerHour){
        return Math.round((1/1.609) * kilometersPerHour);
    }
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(kilometersPerHour+" km/h = "+(int)toMilesPerHour(kilometersPerHour)+" mi/h");
    }
}
