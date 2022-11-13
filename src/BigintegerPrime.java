import java.math.BigInteger;
import java.util.Scanner;

public class BigintegerPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        BigInteger b = new BigInteger(s);
        System.out.println(b.isProbablePrime(1));

        int a  = sc.nextInt();
        System.out.println(a);
        BigInteger c = new BigInteger(String.valueOf(a));
        System.out.println(c.isProbablePrime(1));
    }
}
