public class FloatAndDouble {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " +myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " +myMaxDoubleValue);

        //default for these numbers is double. so if on myfloatvalue,
        // we dont provide f or (float) cast, it will give error.
        int myIntValue = 5;
        float myFloatValue = 5.25f;
        double myDoubleValue = 5.25d;
        // float myFloatValue1 = 5.25; - this gives error
        double myDoubleValue2 = 5.25;
    }
}
