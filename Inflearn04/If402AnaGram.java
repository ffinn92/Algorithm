import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class If402AnaGram {
    public String solution(String fs, String Ss) {
        String answer = "";
        Map<Character, Integer> fsMap = new HashMap<>();
        Map<Character, Integer> SsMap = new HashMap<>();

        for (char key : fs.toCharArray()) {
            fsMap.put(key, fsMap.getOrDefault(key, 0) + 1);
        }

        for (char key : Ss.toCharArray()) {
            SsMap.put(key, SsMap.getOrDefault(key, 0) + 1);
        }

        if (fsMap.equals(SsMap)) {
            answer = "YES";
        } else {
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        If402AnaGram T = new If402AnaGram();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String firstString = br.readLine();
        String secondString = br.readLine();

        String result = T.solution(firstString, secondString);
        System.out.println(result);

    }
}
