public class TernaryOperator {
    public static void main(String[] args) {
        boolean isCar = true;
        boolean wasCar = isCar ? true : false;

        if (wasCar) {
            System.out.println("wasCar is true");
        }
//       is same as
//          if(isCar)
//              wasCar = true;
//          else{
//              wasCar = false;
//          }
    }
}
