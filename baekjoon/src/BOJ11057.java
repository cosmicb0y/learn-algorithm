import java.util.Arrays;
import java.util.Scanner;

public class BOJ11057 {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int[][] intArray = new int[num + 1][10];

        Arrays.fill(intArray[1], 1);

        for (int i = 2; i <= num; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = j; k < 10; k++) {
                    intArray[i][j] += (intArray[i - 1][k]) % 10007;
                }
            }
        }

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += intArray[num][i] % 10007;
        }

        System.out.println(sum % 10007);
    }
}
