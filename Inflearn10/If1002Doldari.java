import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class If1002Doldari {
    static int[] dy;
    public static void main(String[] args) {
        If1002Doldari T = new If1002Doldari();
        Scanner sc = new Scanner(System.in);

        int dordari = sc.nextInt() + 1;
        dy = new int[dordari+1];
        int result = T.solution(dordari);
        System.out.println(result);
    }

    public int solution(int dordari) {
        dy[1] = 1;
        dy[2] = 2;

        for (int i = 3; i <= dordari; i++) {
            dy[i] = dy[i-2] + dy[i-1];
        }

        return dy[dordari];

    }
}
