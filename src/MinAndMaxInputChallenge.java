import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        int counter = 0, min = 0, max = 0, value;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values you want to enter: ");
        if(sc.hasNextInt()) {
            counter = sc.nextInt();
            if (counter < 0) {
                System.out.println("You have entered invalid value");
                return;
            }
        }
        else {
            System.out.println("You have entered invalid value");
            return;
        }
        sc.nextLine();
        while (counter > 0) {
            System.out.println("Enter the value: ");
            if (sc.hasNextInt()) {
                value = sc.nextInt();
                if (value > max)
                    max = value;
                if (value < min)
                    min = value;
                counter--;
            }
            else
                System.out.println("Invalid value entered");
        }
        System.out.println("Min value is: " + min + " and max value is: " + max);
    }
}
