import java.util.Scanner;

public class BJ1550 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputTenSix = sc.next();
        String[] tenSixArr = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        int outputTen = 0;

        for (int i = 0; i < inputTenSix.length(); i++) {
            String checkStr = String.valueOf(inputTenSix.charAt(inputTenSix.length()-i-1));
            for (int j = 0; j < tenSixArr.length; j++) {
                if(checkStr.equals(tenSixArr[j])){
                    outputTen += j * Math.pow(16, i);
                }
            }
        }
        System.out.println(outputTen);
    }
}
