import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class If0303HighestSales {
    public int solution(int d, int cd, int[] s) {
        int p = 0;
        int cdp = 0;
        int max = 0;
        while (p < (d-cd+1)) {
            int sum = 0;
            for (int i = 0; i < cd; i++) {
                sum += s[cdp++];
            }
            p++;
            cdp = p;
            max = Math.max(sum, max);
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        If0303HighestSales T = new If0303HighestSales();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String daysAndsales = br.readLine();
        StringTokenizer st1 = new StringTokenizer(daysAndsales);

        int[] daysSales = new int[2];
        for (int i = 0; i < 2; i++) {
            daysSales[i] = Integer.parseInt(st1.nextToken());
        }
        int days = daysSales[0];
        int[] sales = new int[days];
        int consecutiveDays = daysSales[1];

        String inputSales = br.readLine();
        StringTokenizer st2 = new StringTokenizer(inputSales);
        for (int i = 0; i < days; i++) {
            sales[i] = Integer.parseInt(st2.nextToken());
        }

        int result = T.solution(days, consecutiveDays, sales);
        System.out.println(result);

    }
}