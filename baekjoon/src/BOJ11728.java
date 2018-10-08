import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11728 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] array1 = new int[n];
        int[] array2 = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            array2[i] = Integer.parseInt(st.nextToken());
        }

        int index1 = 0;
        int index2 = 0;
        int index3 = 0;

        int[] answerArray = new int[n + m];

        while (index1 <= n && index2 <= m) {
            if (index1 == n && index2 == m) {
                break;
            }
            if (index1 == n) {
                answerArray[index3] = array2[index2];
                index2++;
                index3++;
                continue;
            }
            if (index2 == m) {
                answerArray[index3] = array1[index1];
                index1++;
                index3++;
                continue;
            }

            if (array1[index1] <= array2[index2]) {
                answerArray[index3] = array1[index1];
                index1++;
            }
            else {
                answerArray[index3] = array2[index2];
                index2++;
            }
            index3++;
        }

        for (int i = 0; i < n + m; i++) {
            System.out.print(answerArray[i] + " ");
        }
        System.out.println();
    }
}
