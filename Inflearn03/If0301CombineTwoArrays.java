import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class If0301CombineTwoArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> totalArray = new ArrayList<>();

        // 첫번째 배열 사이즈를 입력받아 int형으로 변환한다.
        String firstSize = bf.readLine();
        int firstArraySize = Integer.parseInt(firstSize);

        // 첫번째 배열을 한번에 입력받고 하나씩 totalArray에 저장한다.
        String firstArrayInput = bf.readLine();
        StringTokenizer st1 = new StringTokenizer(firstArrayInput);
        for (int i = 0; i < firstArraySize; i++) {
            totalArray.add(Integer.parseInt(st1.nextToken()));
        }

        // 두번째 배열 사이즈를 입력받아 int형으로 변환한다.
        String secondSize = bf.readLine();
        int secondArraySize = Integer.parseInt(secondSize);

        // 두번째 배열을 한번에 입력받고 하나씩 totalArray에 저장한다.
        String secondArrayInput = bf.readLine();
        StringTokenizer st2 = new StringTokenizer(secondArrayInput);
        for (int i = 0; i < secondArraySize; i++) {
            totalArray.add(Integer.parseInt(st2.nextToken()));
        }

        //BufferReader를 닫아주고, 오름차순으로 정렬 후 출력한다.
        bf.close();
        Collections.sort(totalArray);
        for (int i = 0; i < totalArray.size(); i++) {
            if(i == (totalArray.size()-1)) {
                System.out.println(totalArray.get(i));
                return;
            }
            System.out.print(totalArray.get(i) + " ");
        }

    }

}
