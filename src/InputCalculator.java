import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage () {
        double sum = 0, counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the numbers to sum up and get average. Enter a character to quit.");
        while (true) {
            System.out.println("Enter the number: ");
            if (sc.hasNextInt()) {
                sum += sc.nextInt();
                counter++;
            }
            else {
                System.out.println("SUM = " + sum + " AVG = " + sum/counter);
                return;
            }
        }
    }
}
