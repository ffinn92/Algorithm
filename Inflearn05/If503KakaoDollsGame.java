import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class If503KakaoDollsGame {
    public int solution(String[][] b, int[] m) {
        int count = 0;
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < b.length; i++) {
            if(!b[i][m[0]].equals("0")) {
                stack.push(b[i][m[0]]);
                b[i][m[0]] = "0";
                break;
            }
        }

        for (int i = 1; i < m.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(!b[j][m[i]].equals("0")) {
                    if(b[j][m[i]].equals(stack.peek())) {
                        stack.pop();
                        b[j][m[i]] = "0";
                        count++;
                        break;
                    }
                    stack.push(b[j][m[i]]);
                    b[j][m[i]] = "0";
                    break;
                }
            }
        }
        return count * 2;
    }

    public static void main(String[] args) throws IOException {
        If503KakaoDollsGame T = new If503KakaoDollsGame();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int boardSize = Integer.parseInt(br.readLine());
        String[][] board = new String[boardSize][boardSize];

        for (int i = 0; i < boardSize; i++) {
            String[] input = {};
            input = br.readLine().split(" ");
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = input[j];
            }
        }

        int moveCount = Integer.parseInt(br.readLine());
        int[] moves = new int[moveCount];

        String[] moveStr = br.readLine().split(" ");
        for (int i = 0; i < moveCount; i++) {
            moves[i] = Integer.parseInt(moveStr[i]) - 1;
        }

        int result = T.solution(board, moves);
        System.out.println(result);
    }
}

//입력
//        첫 줄에 자연수 N(5<=N<=30)이 주어집니다.
//
//        두 번째 줄부터 N*N board 배열이 주어집니다.
//
//        board의 각 칸에는 0 이상 100 이하인 정수가 담겨있습니다.
//
//        0은 빈 칸을 나타냅니다.
//
//        1 ~ 100의 각 숫자는 각기 다른 인형의 모양을 의미하며 같은 숫자는 같은 모양의 인형을 나타냅니다.
//
//        board배열이 끝난 다음줄에 moves 배열의 길이 M이 주어집니다.
//
//        마지막 줄에는 moves 배열이 주어집니다.
//
//        moves 배열의 크기는 1 이상 1,000 이하입니다.
//
//        moves 배열 각 원소들의 값은 1 이상이며 board 배열의 가로 크기 이하인 자연수입니다.
//
//
//        출력
//        첫 줄에 터트려져 사라진 인형의 개수를 출력합니다.
//
//
//        예시 입력 1
//
//5
//0 0 0 0 0
//0 0 1 0 3
//0 2 5 0 1
//4 2 4 4 2
//3 5 1 3 1
//8
//1 5 3 5 1 2 1 4
//        예시 출력 1
//
//        4