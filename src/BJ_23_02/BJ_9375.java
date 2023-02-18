// HashMap 활용
package BJ_23_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BJ_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            HashMap<String, Integer> hash = new HashMap<>(); // <종류, 개수>

            int n = Integer.parseInt(br.readLine());

            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                st.nextToken(); // 의상 이름 (사용 X)
                String kind = st.nextToken(); // 의상 종류

                if (hash.containsKey(kind)) {
                    hash.put(kind, hash.get(kind) + 1);
                } else {
                    hash.put(kind, 1);
                }
            }

            int result = 1;

            for (int val : hash.values()) {
                result *= (val + 1); // 1을 더하는 이유 : 안 입는 경우도 포함
            }

            sb.append(result - 1).append("\n"); // 1을 빼는 이유 : 모두 안 입는 경우도 포함
        }

        System.out.println(sb);
    }
}