import java.util.Scanner;

public class BJ8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();

        for (int i = 0; i < repeat; i++) {
        String str = sc.next();
        int score = 0;
        int scoreSum = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    score++;
                    scoreSum += score;
                } else if (str.charAt(j) == 'X') {
                    score = 0;
                }
            }
        System.out.println(scoreSum);
        }

    }
}
