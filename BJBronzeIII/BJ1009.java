import java.util.Scanner;

public class BJ1009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int number = 1;

            for (int j = 1; j <= b; j++) {
                number = (a * number) % 10;
            }

            if(number == 0){
                number = 10;
            }

            System.out.println(number);
        }
    }
}
