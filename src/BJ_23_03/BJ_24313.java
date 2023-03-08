/*
f(n) = an + b
g(n) = n
c = c
n0 = d
=> 모든 n >= n0에 대하여 an + b <= cn
*/
package BJ_23_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_24313 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int answer = 1;

        for (int i = d; i <= 100; i++) {
            if (a * i + b > c * i) {
                answer = 0;
                break;
            }
        }

        System.out.println(answer);
    }
}