public class TeenNumberChecker {
    public static boolean hasTeen(int firstVal, int secondVal, int thirdVal) {
        if (isTeen(firstVal) || isTeen(secondVal) || isTeen(thirdVal)) {
            return true;
        }
        return false;
    }
    public static boolean isTeen(int number) {
        if ((number > 12 && number < 20)) {
            return true;
        }
        return false;
    }
}