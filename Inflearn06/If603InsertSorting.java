import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class If603InsertSorting {
    public int[] solution(int n, int[] r) {
        int number = 0;

        for (int i = 1; i < n; i++) {
            number = r[i];
            for (int j = i - 1; j > -1; j--) {
                if (r[j] > number) {
                    r[j+1] = r[j];
                    r[j] = number;
                } else {
                    r[j+1] = number;
                    break;
                }
            }
        }

        return r;
    }

    public static void main(String[] args) throws IOException {
        If603InsertSorting T = new If603InsertSorting();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int[] numbers = new int[input];

        String[] str = br.readLine().split(" ");
        for (int i = 0; i < input; i++) {
            numbers[i] = Integer.parseInt(str[i]);
        }

        int[] result = T.solution(input, numbers);
        for (int i = 0; i < input; i++) {
            if (i == input - 1) {
                System.out.print(result[i]);
                break;
            }
            System.out.print(result[i] + " ");
        }
    }
}

//3. 삽입 정렬
//        설명
//
//        N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
//
//        정렬하는 방법은 삽입정렬입니다.
//
//
//        입력
//        첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
//
//        두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.
//
//
//        출력
//        오름차순으로 정렬된 수열을 출력합니다.
//
//
//        예시 입력 1
//
//        6
//        11 7 5 6 10 9
//        예시 출력 1
//
//        5 6 7 9 10 11







