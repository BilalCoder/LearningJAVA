import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        int counter = 0, sum =0, number;
        Scanner sc = new Scanner(System.in);
        while (counter < 4) {
            System.out.println("Enter the number #" + (counter + 1) + ": ");
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                sum += number;
                counter++;
            }
            else {
                System.out.println("Invalid value entered");
            }
            sc.nextLine();
        }
        System.out.println("The sum of the number entered is: " + sum);
    }
}
