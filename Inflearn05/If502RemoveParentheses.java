import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class If502CorrectParentheses {
    public String solution(String tp) {
        String answer;


    }

    public static void main(String[] args) throws IOException {
        If502CorrectParentheses T = new If502CorrectParentheses();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //입력단
        String totalParentheses = br.readLine();

        String result = T.solution(totalParentheses);

        System.out.println(result);
    }
}

///2. 괄호문자제거
//        설명
//
//        입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
//
//
//        입력
//        첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
//
//
//        출력
//        남은 문자만 출력한다.
//
//
//        예시 입력 1
//
//        (A(BC)D)EF(G(H)(IJ)K)LM(N)
//        예시 출력 1
//
//        EFLM