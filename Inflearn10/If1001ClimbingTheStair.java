import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class If1001ClimbingTheStair {
    public static void main(String[] args) {
        If1001ClimbingTheStair T = new If1001ClimbingTheStair();
        Scanner sc = new Scanner(System.in);

        int stairs = sc.nextInt();

        int result = T.solution(stairs);
        System.out.println(result);
    }

    public int solution(int stairs) {
        List<Integer> how = new ArrayList<>();
        int count = 0;

        if(!how.contains(1)) {
            return count;
        }else {
            solution(stairs);
            count++;
        }



        return count;

    }
}
