import java.util.Scanner;

public class SW1206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int a = 1; a <= 10; a++) {
            int width = sc.nextInt();

            int[] building = new int[width];

            for (int i = 0; i < width; i++) {
                building[i] = sc.nextInt();
            }

            int answer = 0;

            for (int i = 2; i < width - 2; i++) {
                int view = Math.max(0, building[i] - Math.max(Math.max(building[i - 2], building[i - 1]), Math.max(building[i + 1], building[i + 2])));

                answer += view;
            }

            System.out.println("#" + a + " " + answer);
        }

    }
}
