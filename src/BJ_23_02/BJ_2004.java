// 런타임 에러를 방지하기 위해서 long 타입으로 설정할 것
package BJ_23_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Integer.parseInt(st.nextToken());
        long m = Integer.parseInt(st.nextToken());

        long two = multi(n, 2) - multi(n - m, 2) - multi(m, 2); // 2의 승수
        long five = multi(n, 5) - multi(n - m, 5) - multi(m, 5); // 5의 승수

        System.out.println(Math.min(two, five)); // 두 승수 중 작은 값을 출력
    }

    public static long multi(long input, long num) { // 승수를 구하는 함수
        long count = 0;

        for (long i = num; i <= input; i *= num) {
            count += input / i;
        }

        return count;
    }
}