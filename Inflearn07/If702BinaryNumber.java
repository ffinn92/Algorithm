import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class If702BinaryNumber {
    public void DFS(int n) {
        if(n == 0) {
            return;
        } else {
            DFS(n/2);
            System.out.print(n%2 + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        If702BinaryNumber T = new If702BinaryNumber();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        T.DFS(input);

    }
}






