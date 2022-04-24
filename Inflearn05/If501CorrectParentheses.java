import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class If501CorrectParentheses {
    public String solution(String tp) {
        String answer;

        while(tp.contains("()")) {
            tp = tp.replace("()","");
        }

        if(tp.length() == 0) {
            return answer = "YES";
        } else {
            return answer = "NO";
        }
    }

    public static void main(String[] args) throws IOException {
        If501CorrectParentheses T = new If501CorrectParentheses();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //입력단
        String totalParentheses = br.readLine();


        String result = T.solution(totalParentheses);

        System.out.println(result);
    }
}

// 아이디어, 괄호 갯수의 문제가 아니다 순서의 문제인듯하다.
//
//1. 올바른 괄호
//        설명
//
//        괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
//
//        (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
//
//
//        입력
//        첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
//
//
//        출력
//        첫 번째 줄에 YES, NO를 출력한다.
//
//
//        예시 입력 1
//
//        (()(()))(()
//        예시 출력 1
//
//        NO