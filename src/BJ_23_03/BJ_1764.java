package BJ_23_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BJ_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> h1 = new HashSet<>();
        ArrayList<String> h2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            h1.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            String str = br.readLine();

            if (h1.contains(str)) {
                h2.add(str);
            }
        }

        Collections.sort(h2);
        sb.append(h2.size()).append("\n");

        for (String str : h2) {
            sb.append(str).append("\n");
        }

        System.out.println(sb);
    }
}