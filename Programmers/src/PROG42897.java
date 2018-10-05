public class PROG42897 {
    public static void main(String[] args) {
        int[] money = new int[]{1, 2, 3, 1};

        int a = solution(money);

        System.out.println(a);
    }

    private static int solution(int[] money) {
        int length = money.length;

        if (length == 3) {
            return Math.max(Math.max(money[0], money[1]), money[2]);
        }

        int[] DP1 = new int[length];
        int[] DP2 = new int[length];

        DP1[0] = money[0];
        DP1[1] = money[0];
        
        DP2[1] = money[1];

        for (int i = 2; i < length; i++) {
            DP1[i] = Math.max(DP1[i - 1], DP1[i - 2] + money[i]);
            DP2[i] = Math.max(DP2[i - 1], DP2[i - 2] + money[i]);
        }


        return Math.max(DP1[length - 2], DP2[length - 1]);
    }
}
