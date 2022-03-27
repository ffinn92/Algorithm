import java.util.Scanner;

public class BJ2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 0,       1,                    2                           3              4
        // 1,(1)   6,(6/1)             12,(18/3)                  18,(36/6)      24,(60/10)
        // (1) (2,3,4,5,6,7) (8,9,10,11,12,13,14,15,16,17,18,19) (20,21...36,37) (38...61)
        // 0    0 0 0 0 1 1   1 1 1  1  2   2  2  2  2 2  3   3    3 3 ..4 5 6..6
        // 입력받은 수까지 1씩 플러스 카운트 한다.

        int count = 1;
        int range = 2;

        if (n == 1) {
            System.out.println(1);
        }

        else {
            while(range <= n) {
                range = range + (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}
