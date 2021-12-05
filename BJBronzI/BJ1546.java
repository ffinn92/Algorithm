import java.util.Scanner;

public class BJ1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int reps = sc.nextInt();
        double[] scoreArr = new double[reps];

        double scoreSum = 0;
        double newAvrage = 0;

        for (int i = 0; i < reps; i++) {
            scoreArr[i] = sc.nextDouble();
        }

        double max = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (max < scoreArr[i]) {
                max = scoreArr[i];
            }
        }

        for (int i = 0; i < scoreArr.length; i++) {
            scoreSum += scoreArr[i] / max * 100;
        }

        newAvrage = scoreSum / reps;
        System.out.println(newAvrage);

    }
}
