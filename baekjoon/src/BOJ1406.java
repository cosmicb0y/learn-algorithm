import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class BOJ1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> curL = new Stack<>();
        Stack<Character> curR = new Stack<>();

        curL.addAll(br.readLine().chars().mapToObj(i -> (char) i).collect(Collectors.toList()));

        int total = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < total; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char op = st.nextToken().charAt(0);

            switch (op) {
                case 'L':
                    if (!curL.isEmpty()) curR.push(curL.pop());
                    break;
                case 'D':
                    if (!curR.isEmpty()) curL.push(curR.pop());
                    break;
                case 'B':
                    if (!curL.isEmpty()) curL.pop();
                    break;
                case 'P':
                    curL.push(st.nextToken().charAt(0));
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator<?> it = curL.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        while (!curR.isEmpty()) {
            sb.append(curR.pop());
        }


        System.out.println(sb.toString());
    }
}
