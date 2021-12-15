import java.util.Scanner;

public class BJ11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberLength = sc.nextInt();
        int[] arr = new int[numberLength];
        int sum = 0;
        String num = sc.next();

        for (int i = 0; i < numberLength; i++) {
            arr[i] = Integer.parseInt(num.substring(i, i+1));
            sum += arr[i];
        }

        System.out.println(sum);

    }
}

//문제
//        N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
//
//        출력
//        입력으로 주어진 숫자 N개의 합을 출력한다.
//
//        예제 입력 4
//        11
//        10987654321
//        예제 출력 4
//        46