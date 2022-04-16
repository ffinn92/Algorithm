import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class If401ClassPresident {
    public String solution(int sn, int[] c, String[] st) {
        Map<Integer, String> maps = new HashMap<>();

        for (int i = 0; i < sn; i++) {
            if (st[i].equals("A")) c[0]++;
            else if (st[i].equals("B")) c[1]++;
            else if (st[i].equals("C")) c[2]++;
            else if (st[i].equals("D")) c[3]++;
            else if (st[i].equals("E")) c[4]++;
        }

        maps.put(c[0], "A");
        maps.put(c[1], "B");
        maps.put(c[2], "C");
        maps.put(c[3], "D");
        maps.put(c[4], "E");

        int max = 0;

        for (int i = 0; i < 5; i++) {
            if(c[i] > max) {
                max = c[i];
            }
        }

        String result = "";
        result = maps.get(max);

        return result;
    }

    public static void main(String[] args) throws IOException {
        If401ClassPresident T = new If401ClassPresident();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int studentNumbers = Integer.parseInt(br.readLine());
        String totalVotes = br.readLine();
        int[] count = {0, 0, 0, 0, 0};

        String[] split = totalVotes.split("");
        String result = T.solution(studentNumbers, count, split);

        System.out.println(result);
    }
}