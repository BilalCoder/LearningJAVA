public class TernaryOperator {
    public static void main(String[] args) {
        boolean isCar = true;
        boolean wasCar = isCar ? true : false;
//        is same as
//                if(isCar)
//                    wasCar = true;
//                else{
//                    wasCar = false;
//                }
        if (wasCar) {
            System.out.println("wasCar is true");
        }
    }
}
