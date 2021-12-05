import java.util.Scanner;

public class BJ2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int reps = sc.nextInt();
        String star = "";

        for (int i = 0; i < reps; i++) {
            star += "*";
            System.out.println(star);
        }

    }
}
