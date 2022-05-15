import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class If801AmazonInterview {
    public String DFS (int[] numbers, int ss1, int ss2) {
        if(ss2 == 0) {
            return "NO";
        } else {
            int[] subSet1 = new int[ss1];
            int[] subSet2 = new int[ss2];


            int sum1 = Arrays.stream(subSet1).sum();
            int sum2 = Arrays.stream(subSet2).sum();
        }
    }

    public static void main(String[] args) throws IOException {
        If801AmazonInterview T = new If801AmazonInterview();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int[] numbers = new int[input];

        String[] str = br.readLine().split(" ");
        for (int i = 0; i < input; i++) {
            numbers[i] = Integer.parseInt(str[i]);
        }
        br.close();

        int subSetSize1 = 1;
        int subSetSize2 = input - subSetSize1;
        String result = T.DFS(numbers, subSetSize1, subSetSize2);
        System.out.println(result);

    }
}






