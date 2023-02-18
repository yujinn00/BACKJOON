// 조합의 성질 및 DP 활용
package BJ_23_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1010 {
    public static int[][] dp = new int[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken()); // com() 함수의 두 번째 인자 (int r)
            int m = Integer.parseInt(st.nextToken()); // com() 함수의 첫 번째 인자 (int n)

            sb.append(com(m, n)).append("\n");
        }

        System.out.println(sb);
    }

    public static int com(int n, int r) {
        if (dp[n][r] > 0) {
            return dp[n][r];
        }

        if (n == r || r == 0) {
            return dp[n][r] = 1;
        } else {
            return dp[n][r] = com(n - 1, r) + com(n - 1, r - 1);
        }
    }
}