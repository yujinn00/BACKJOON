package BJ_23_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10812 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] basket = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            basket[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int[] tmp = new int[b - a + 1]; // 회전을 위한 임시 배열
            int idx = 0; // 임시 배열에 사용할 인덱스

            for (int j = c; j <= b; j++) { // basket의 인덱스 c부터 b까지를 임시 배열에 할당
                tmp[idx] = basket[j];
                idx++;
            }

            for (int j = a; j < c; j++) { // basket의 인덱스 a부터 c - 1까지를 임시 배열에 할당
                tmp[idx] = basket[j];
                idx++;
            }

            for (int cp : tmp) { // 할당한 임시 배열을 basket에 덮어쓰기
                basket[a++] = cp;
            }
        }

        for (int i = 1; i <= n; i++) {
            sb.append(basket[i]).append(" ");
        }

        System.out.println(sb);
    }
}