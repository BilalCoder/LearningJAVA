public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome (12321));
    }
    public static boolean isPalindrome (int number) {
        int remainder = 0, reverse = 0, duplicatedNumber = number;
        while (duplicatedNumber != 0) {
            remainder = duplicatedNumber % 10;
            reverse *= 10;
            reverse += remainder;
            duplicatedNumber /= 10;
        }
        return number == reverse;
    }
}
