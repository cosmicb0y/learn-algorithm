import java.util.Scanner;

public class BOJ10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            String str = sc.next();
            String[] strArray = str.split(",");
            int a = Integer.parseInt(strArray[0]);
            int b = Integer.parseInt(strArray[1]);

            System.out.println(a + b);
        }
    }
}
