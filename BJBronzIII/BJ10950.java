import java.util.Scanner;

public class BJ10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNumber = sc.nextInt();

        for (int i = 0; i < caseNumber; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a+b);
        }

    }
}