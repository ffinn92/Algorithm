import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class If0302FindingCommonElements {
    public ArrayList<Integer> solution(int fs, int ss, int[] fa, int[] sa) {
        ArrayList<Integer> answer = new ArrayList<>();
        int fp = 0;
        int sp = 0;
        while (fp < fs && sp < ss) {
            if(fa[fp] < sa[sp]) {
                fp++;
            }
            else if(fa[fp] == sa[sp]) {
                answer.add(fa[fp++]);
                sp++;
            }
            else if(fa[fp] > sa[sp]) {
                sp++;
            }
        }
        Collections.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        If0302FindingCommonElements T = new If0302FindingCommonElements();
        Scanner sc = new Scanner(System.in);

        int firstSize = sc.nextInt();
        int[] firstArray = new int[firstSize];

        for (int i = 0; i < firstSize; i++) {
            firstArray[i] = sc.nextInt();
        }
        Arrays.sort(firstArray);

        int secondSize = sc.nextInt();
        int[] secondArray = new int[secondSize];

        for (int i = 0; i < secondSize; i++) {
            secondArray[i] = sc.nextInt();
        }
        Arrays.sort(secondArray);


        sc.close();

        for (int a : T.solution(firstSize, secondSize, firstArray, secondArray)) {
            System.out.print(a + " ");
        }

    }
}
