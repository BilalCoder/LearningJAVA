public class Casting {
    public static void main(String[] args) {
        int intNumber = 5;
        short shortNumber = 5;
        byte byteNumber = 5;
        char charNumber = 'A';
        long longNumber = 5;
        double doubleNumber = 5;
        //shortNumber = intNumber; - error
        shortNumber = (short) intNumber;
        intNumber = shortNumber;
        //intNumber = doubleNumber - error
        doubleNumber = intNumber;
        intNumber = charNumber;
        System.out.println(intNumber);
    }
}
