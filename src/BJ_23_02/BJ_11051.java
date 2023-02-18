// 이항 계수의 성질 및 DP 활용
/*
BC() 함수에서 10007을 나누지 않으면 그때 이미 값이 long 타입을 초과하기 때문에
main() 함수가 아닌 BC() 함수에서 미리 10007을 나누는 것이므로
2차원 배열 dp는 굳이 long 타입이 아니어도 상관 X
*/
package BJ_23_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_11051 {
    public static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        dp = new int[n + 1][k + 1];

        System.out.println(BC(n, k));
    }

    public static int BC(int n, int k) {
       if (dp[n][k] > 0) { // 이미 풀었던 문제일 경우, 값을 재활용
           return dp[n][k];
       }

        if (k == 0 || k == n) {
            return dp[n][k] = 1;
        } else {
            return dp[n][k] = (BC(n - 1, k - 1) + BC(n - 1, k)) % 10007;
        }
    }
}