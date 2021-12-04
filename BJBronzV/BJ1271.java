import java.math.BigInteger;
import java.util.Scanner;

public class BJ1271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger money = sc.nextBigInteger();
        BigInteger monster = sc.nextBigInteger();

        sc.close();

        System.out.println(money.divide(monster));
        System.out.println(money.remainder(monster));

    }
}
