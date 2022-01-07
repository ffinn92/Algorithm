import java.util.Scanner;

public class BJ1076 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstColor = sc.next();
        String secondColor = sc.next();
        String lastColor = sc.next();

        String[] colorSet = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};

        long firstNumber = 0;
        long secondNumber = 0;
        long lastNumber = 0;
        long result = 0;

        for (int i = 0; i < colorSet.length; i++) {
            if(firstColor.equals(colorSet[i])){
                firstNumber = i * 10;
            }

            if(secondColor.equals(colorSet[i])){
                secondNumber = i;
            }

            if(lastColor.equals(colorSet[i])){
                lastNumber = (int)Math.pow(10,i);
            }
        }


        result = (firstNumber + secondNumber)*lastNumber;
        System.out.println(result);

    }
}
