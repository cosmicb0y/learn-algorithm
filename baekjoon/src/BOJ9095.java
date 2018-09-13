import java.util.Scanner;

public class BOJ9095 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = scanner.nextInt();

        int[] intArray = new int[12];
        intArray[0] = 1;
        intArray[1] = 1;
        intArray[2] = 2;

        for (int i = 3; i < 12; i++) {
            intArray[i] = intArray[i - 1] + intArray[i - 2] + intArray[i - 3];
        }
        for (int i = 0; i < total; i++) {
            int num = scanner.nextInt();
            System.out.println(intArray[num]);
        }
    }
}
