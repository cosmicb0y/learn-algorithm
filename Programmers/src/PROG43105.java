public class PROG43105 {
    public static void main(String[] args) {
        int[][] trianlge = new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};

        int a = solution(trianlge);

        System.out.println(a);

    }

    private static int solution(int[][] triangle) {
        int max = 0;
        int[][] DP = new int[triangle.length][];

        for (int i = 0; i < triangle.length; i++) {
            DP[i] = new int[triangle[i].length];
        }


        DP[0][0] = triangle[0][0];

        if (triangle.length > 1) {
            DP[1][0] = DP[0][0] + triangle[1][0];
            DP[1][1] = DP[0][0] + triangle[1][1];
        }

        for (int i = 2; i < DP.length; i++) {
            DP[i][0] = DP[i - 1][0] + triangle[i][0];
            for (int j = 1; j < DP[i].length - 1; j++) {
                DP[i][j] = Math.max(DP[i - 1][j - 1], DP[i - 1][j]) + triangle[i][j];
                max = Math.max(max, DP[i][j]);
            }
            DP[i][DP[i].length - 1] = DP[i - 1][DP[i - 1].length - 1] + triangle[i][triangle[i].length - 1];
        }

        return max;
    }
}
