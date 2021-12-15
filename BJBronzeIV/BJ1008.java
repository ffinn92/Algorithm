import java.util.Scanner;

public class BJ1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        sc.close();

        double result = a / b;
        System.out.println(result);
    }
}
