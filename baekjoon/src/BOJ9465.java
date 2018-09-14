import java.util.Scanner;

public class BOJ9465 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int total = scanner.nextInt();

        for (int i = 0; i < total; i++) {
            int num = scanner.nextInt();
            int[][][] intArray = new int[2][num][2];
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < num; k++) {
                    intArray[j][k][0] = scanner.nextInt();
                }
            }

            intArray[0][0][1] = intArray[0][0][0];
            intArray[1][0][1] = intArray[1][0][0];

            if(num == 1) {
                System.out.println(Math.max(intArray[0][0][1], intArray[1][0][1]));
                return;
            }

            intArray[0][1][1] = intArray[0][1][0] + intArray[1][0][1];
            intArray[1][1][1] = intArray[1][1][0] + intArray[0][0][1];

            for (int j = 2; j < num; j++) {
                intArray[0][j][1] = Math.max(intArray[1][j - 1][1], intArray[1][j - 2][1]) + intArray[0][j][0];
                intArray[1][j][1] = Math.max(intArray[0][j - 1][1], intArray[0][j - 2][1]) + intArray[1][j][0];
            }

            System.out.println(Math.max(intArray[0][num - 1][1], intArray[1][num - 1][1]));

        }
    }
}
