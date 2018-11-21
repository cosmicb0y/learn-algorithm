import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ16503 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k1 = Integer.parseInt(st.nextToken());
        String o1 = st.nextToken();
        int k2 = Integer.parseInt(st.nextToken());
        String o2 = st.nextToken();
        int k3 = Integer.parseInt(st.nextToken());

        int result1 = calc(calc(k1, k2, o1), k3, o2);
        int result2 = calc(k1, calc(k2, k3, o2), o1);

        System.out.println(Math.min(result1, result2));
        System.out.println(Math.max(result1, result2));
    }

    private static int calc(int k1, int k2, String o1) {
        int result = 0;
        if (o1.equals("+")) result = k1 + k2;
        else if (o1.equals("-")) result = k1 - k2;
        else if (o1.equals("*")) result = k1 * k2;
        else if (o1.equals("/")) result = k1 / k2;

        return result;
    }
}
