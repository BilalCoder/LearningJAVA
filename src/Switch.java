public class Switch {

    public static void main(String[] args) {
//        int value = 3;
//        if(value == 1) {
//            System.out.println("Value was 1");
//        } else if(value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }
//        Above is the if implementation, and below is how we can implement the same using switch

        int switchValue = 6;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("was a 3 or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1,2,3, 4 or 5");
                break;
        }

        char character = 'b';
        switch (character) {
            case 'B':
                System.out.println("B");
                break;
            case 'b':
                System.out.println("b");
                break;
        }

        String name = "Bilal";
        switch (name) {
            case "Aman":
                System.out.println("Aman");
                break;
            case "Bilal":
                System.out.println("Bilal");
                break;
            case "bilal":
                System.out.println("bilal");
                break;
        }
    }
}
