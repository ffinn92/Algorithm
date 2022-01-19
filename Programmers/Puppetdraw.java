import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Puppetdraw {
    public int solution(int[][] board, int[] moves) {
        int count = 0;
        List<Integer> basket = new ArrayList<Integer>();

        for (int i = 0; i < moves.length; i++) {
            int n = moves[i];
            for (int j = 0; j < board.length; j++) {
                if (board[j][n - 1] > 0) {
                    basket.add(board[j][n - 1]);
                    board[j][n - 1] = 0;
                    break;
                }
            }
        }

        while(0 != lastCount(basket)){
            for (int i = 0; i < basket.size() - 1; i++) {
                if (Objects.equals(basket.get(i), basket.get(i + 1))) {
                    count++;
                    basket.remove(i);
                    basket.remove(i);
                    break;
                }
            }
        }

        int answer = count * 2;
        return answer;
    }

    private int lastCount(List<Integer> basket) {
    int lastCount = 0;
        for (int i = 0; i < basket.size() - 1; i++) {
            if (Objects.equals(basket.get(i), basket.get(i + 1))) {
                lastCount++;
            }
        }
        return lastCount;
    }

}

