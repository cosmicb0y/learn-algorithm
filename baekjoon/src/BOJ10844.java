import java.util.Arrays;
import java.util.Scanner;

public class BOJ10844 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int div = 1000000000;

        int num = scanner.nextInt();

        int[][] intArray = new int[num + 1][10];

        Arrays.fill(intArray[1], 1);
        intArray[1][0] = 0;

        for (int i = 2; i <= num; i++) {
            intArray[i][1] += intArray[i - 1][0] % div;
            for (int j = 1; j < 9; j++) {
                intArray[i][j - 1] += intArray[i - 1][j] % div;
                intArray[i][j + 1] += intArray[i - 1][j] % div;
            }
            intArray[i][8] += intArray[i - 1][9] % div;
            for (int j = 0; j < 10; j++) {
                intArray[i][j] %= div;
            }
        }

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += intArray[num][i];
            sum %= div;
        }

        System.out.println(sum % div);
    }
}
