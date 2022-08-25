public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(1234, 2345));
        System.out.println(hasSharedDigit(1234, 8795));
        System.out.println(hasSharedDigit(2323, 4573));
        System.out.println(hasSharedDigit(12, 13));
        System.out.println(hasSharedDigit(-1245, 798));
    }
    public static boolean hasSharedDigit (int firstNumber, int secondNumber) {
        //  comment the belo if code if you want for multiple digit number
        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }
        int firstNumberDigit = 0, secondNumberDigit = 0, secondNumberDuplicate = 0;
        while (firstNumber > 0) {
            firstNumberDigit = firstNumber % 10;
            firstNumber /= 10;
            secondNumberDuplicate = secondNumber;
            while (secondNumberDuplicate > 0) {
                secondNumberDigit = secondNumberDuplicate % 10;
                secondNumberDuplicate /= 10;
                if (secondNumberDigit == firstNumberDigit)
                    return true;
            }
        }
        return false;
    }
}
