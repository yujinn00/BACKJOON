package BJ_23_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BJ_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>(); // Integer 출력
        String[] arr = new String[n + 1]; // String 출력

        for (int i = 1; i <= n; i++) {
            String str = br.readLine();

            map.put(str, i);
            arr[i] = str;
        }

        for (int i = 0; i < m; i++) {
            String str = br.readLine();

            if (map.containsKey(str)) {
                sb.append(map.get(str)).append("\n");
            } else {
                sb.append(arr[Integer.parseInt(str)]).append("\n");
            }
        }

        System.out.println(sb);
    }
}