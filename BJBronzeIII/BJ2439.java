import java.util.Scanner;

public class BJ2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int reps = sc.nextInt();
        String star = "";
        String[] arr = new String[reps];
        String insert = "";

        for (int i = 0; i < reps; i++) {
            arr[i] = insert;
            insert += " ";
        }

        for (int i = 0 ,j = (reps-1); i < reps ; i++, j--){
            star += "*";
            System.out.println(arr[j]+star);
        }

    }
}
