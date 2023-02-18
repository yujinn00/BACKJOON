// 이항 계수의 성질 활용
package BJ_23_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(BC(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
    }

    public static int BC(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return BC(n - 1, k - 1) + BC(n - 1, k);
        }
    }
}