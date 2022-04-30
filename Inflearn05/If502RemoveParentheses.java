import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class If502RemoveParentheses {
    public String solution(String[] sp) {
        String answer = "YES";
        Stack<String> stack = new Stack<>();

        int p1 = 0;
        int max = sp.length;

        while(p1 != max) {
            if(sp[p1].equals("(")) {
                for (int i = p1; i < max; i++) {
                    stack.push(sp[p1]);
                    if(sp[p1].equals(")")) {
                        return stack.pop();
                    }
                }
            }

        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        If502RemoveParentheses T = new If502RemoveParentheses();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //입력단
        String str = br.readLine();
        String[] split = str.split("");

        String result = T.solution(split);
        System.out.println(result);
    }
}

// 아이디어, ")" 을 찾고 ")" 배열 번호p1 기준으로 "(" 시작되는 배열 p2를 찾고 그 p1+1 ~ p2-1까지의 배열을 answer 에 추가한다.
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
//        (A(BC)DFF)EF(G(H)(IJ)K)LM(N)
//        예시 출력 1
//
//        EFLM