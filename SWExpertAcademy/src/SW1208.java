import java.util.Arrays;
import java.util.Scanner;

public class SW1208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] blocks = new int[100];

        for (int a = 1; a <= 10; a++) {
            int dump = sc.nextInt();

            for (int i = 0; i < 100; i++) {
                blocks[i] = sc.nextInt();
            }

            Arrays.sort(blocks);

            for (int i = 0; i < dump; i++) {
                if (blocks[0] == blocks[99]) {
                  break;
                }
                blocks[0]++;
                blocks[99]--;
                Arrays.sort(blocks);
            }

            System.out.println("#" + a + " " + (blocks[99] - blocks[0]));
        }

    }
}
