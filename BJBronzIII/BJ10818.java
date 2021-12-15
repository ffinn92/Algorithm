import java.util.Scanner;

public class BJ10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNumber = sc.nextInt();
        int[] arr = new int[caseNumber];

        int min = 1000000;
        int max = -1000000;

        for (int i = 0; i < caseNumber; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(min + " " + max);
    }
}