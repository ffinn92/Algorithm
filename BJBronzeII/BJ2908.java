import java.util.Scanner;

public class BJ2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String aStr = Integer.toString(a);
        String bStr = Integer.toString(b);

        String[] aArr = aStr.split("");
        String[] bArr = bStr.split("");

        String[] caArr = new String[aArr.length];
        String[] cbArr = new String[bArr.length];

        for (int i = 0, k = (aArr.length-1); i < aArr.length; i++, k--) {
            caArr[i] = aArr[k];
            cbArr[i] = bArr[k];
        }

        aStr = String.join("",caArr);
        bStr = String.join("",cbArr);

        a = Integer.parseInt(aStr);
        b = Integer.parseInt(bStr);

        if(a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}

//    상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다.
//    이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다.
//    상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
//
//        상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면,
//        상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
//
//        두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
//
//        출력
//        첫째 줄에 상수의 대답을 출력한다.
//
//        예제 입력 1
//        734 893
//        예제 출력 1
//        437
//        예제 입력 2
//        221 231
//        예제 출력 2
//        132
//        예제 입력 3
//        839 237
//        예제 출력 3
//        938