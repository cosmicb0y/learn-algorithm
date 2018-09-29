import java.util.Scanner;

public class BOJ14888 {
    static int n, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    static boolean[] visited;
    static int[] opOrder;
    static int[] number;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        number = new int[n];

        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }

        opOrder = new int[n - 1];
        visited = new boolean[n - 1];
        int index = 0;

        for (int i = 0; i < 4; i++) {
            int cnt = sc.nextInt();
            for (int j = 0; j < cnt; j++) {
                opOrder[index++] = i + 1;
            }
        }

        dfs(0, 1, number[0], 0);

        System.out.println(max);
        System.out.println(min);

    }

    private static void dfs(int v, int index, int num, int len) {
        int result = 0;

        if (len == n - 1) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        else {
            for (int i = 0; i < n - 1; i++) {
                if (!visited[i]) {
                    switch (opOrder[i]) {
                        case 1:
                            result = num + number[index];
                            break;
                        case 2:
                            result = num - number[index];
                            break;
                        case 3:
                            result = num * number[index];
                            break;
                        case 4:
                            result = num / number[index];
                            break;
                    }
                    visited[i] = true;
                    dfs(i, index + 1, result, len + 1);
                }
            }
        }

        visited[v] = false;
    }
}
