import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class If403TypesOfSales {
    public List<Integer> solution(int n, int k, String[] sales) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> maps = new HashMap<>();

        int p1 = 0;
        int p2 = k-1;


        for (int i = 0; i < k-1; i++) {
            maps.put(sales[i],  maps.getOrDefault(sales[i], 0) + 1);
        }

        while (p2 != n) {
            maps.put(sales[p2], maps.getOrDefault(sales[p2], 0) + 1);
            answer.add(maps.size());
            p2++;

            maps.put(sales[p1], maps.get(sales[p1]) - 1);
            if(maps.get(sales[p1]).equals(0)) {
                maps.remove(sales[p1]);
            }
            p1++;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        If403TypesOfSales T = new If403TypesOfSales();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nk = br.readLine();
        StringTokenizer st1 = new StringTokenizer(nk);

        int n = Integer.parseInt(st1.nextToken());
        int k = Integer.parseInt(st1.nextToken());

        String s = br.readLine();
        StringTokenizer st2 = new StringTokenizer(s);
        String[] sales = new String[n];
        for (int i = 0; i < n; i++) {
            sales[i] = st2.nextToken();
        }

        List<Integer> result = T.solution(n, k, sales);
        for (int i = 0; i < result.size(); i++) {
            if (i == result.size()-1) {
                System.out.print(result.get(i));
                return;
            }
            System.out.print(result.get(i) + " ");
        }

    }
}
