package GoriCon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GoriCon02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int bR = Integer.parseInt(st.nextToken());
        int bC = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int dR = Integer.parseInt(st.nextToken());
        int dC = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int jR = Integer.parseInt(st.nextToken());
        int jC = Integer.parseInt(st.nextToken());

        int bDis = Math.max(Math.abs(bR - jR), Math.abs(bC - jC));
        int dDis = Math.abs(dR - jR) + Math.abs(dC - jC);

        String answer = "";
        if (bDis < dDis) {
            answer = "bessie";
        }
        else if (bDis> dDis) {
            answer = "daisy";
        }
        else {
            answer = "tie";
        }

        System.out.println(answer);
    }
}
