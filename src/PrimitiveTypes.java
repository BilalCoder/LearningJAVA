public class PrimitiveTypes {
    public static void main (String[] args) {
        byte byteNumber = 12;
        short shortNumber = 30;
        int intNumber = 29;
        long longNumber = 50L + (10 * (byteNumber + shortNumber + intNumber));
        System.out.println(longNumber);
        // In the next line casting is needed because 50 is int.
        short shortTotal = (short) ( 50 + (10 * (byteNumber + shortNumber + intNumber)));
        System.out.println(shortTotal);
    }
}
