import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class If601SelectiveSorting {
    public int[] solution(int[] n) {
        Arrays.sort(n);
        return n;
    }

    public static void main(String[] args) throws IOException {
        If601SelectiveSorting T = new If601SelectiveSorting();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int[] numbers = new int[input];

        String[] str = br.readLine().split(" ");
        for (int i = 0; i < input; i++) {
            numbers[i] = Integer.parseInt(str[i]);
        }

        int[] result = T.solution(numbers);
        for (int i = 0; i < input; i++) {
            if(i == input-1) {
                System.out.print(result[i]);
                break;
            }
            System.out.print(result[i] + " ");
        }
    }
}

//1. 선택 정렬
//        설명
//
//        N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
//
//        정렬하는 방법은 선택정렬입니다.
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
//        13 5 11 7 23 15
//        예시 출력 1
//
//        5 7 11 13 15 23