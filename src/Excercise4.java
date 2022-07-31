public class Excercise4 {
    public static void main(String[] args) {

        //Convert a given number of pounds to Kg's.

        double poundValue = 200;
        double POUND_TO_KG_MULTIPLIER = 0.45359237;
        double kgValue = poundValue * POUND_TO_KG_MULTIPLIER;

        System.out.println("The value of " + poundValue + " pounds to KG is " + kgValue );
    }
}
