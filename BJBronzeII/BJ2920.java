import java.util.Scanner;

public class BJ2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String outPut = "";
        int[] inputScale = new int[8];

        for (int i = 0; i < 8; i++) {
            inputScale[i] = sc.nextInt();
        }

        for (int i = 1; i < inputScale.length; i++) {
            if (inputScale[i-1] - inputScale[i] == -1) {
                outPut = "ascending";
            } else if (inputScale[i-1] - inputScale[i] == 1) {
                outPut = "descending";
            } else {
                outPut = "mixed";
                break;
            }
        }
        System.out.println(outPut);
    }
}
