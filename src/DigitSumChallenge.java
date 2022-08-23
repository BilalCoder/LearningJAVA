public class DigitSumChallenge {
    public static void main(String[] args) {
        //the main method which calls sumDigits method
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(0));
        System.out.println(sumDigits(9999999));
        System.out.println(sumDigits(782798137));
        System.out.println(sumDigits(12338739));
        System.out.println(sumDigits(-111111));
    }
    public static int sumDigits(int number) {
        if (number < 10)
            return -1;
        int digit = 0, sum = 0;
        while (number > 0) {
            digit = number % 10;
            number = number / 10;
            sum += digit;
        }
        return sum;
    }
}
