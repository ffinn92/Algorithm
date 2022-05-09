import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class If701RecursiveFunction {
    public void solution(int input) {
        if(input == 0) {
            return;
        } else {
            solution(input - 1);
            System.out.print(input + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        If701RecursiveFunction T = new If701RecursiveFunction();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        T.solution(input);

    }
}






