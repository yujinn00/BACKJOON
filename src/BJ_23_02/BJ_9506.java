package BJ_23_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BJ_9506 {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == -1) {
                break;
            } else {
                PN(n);
            }
        }

        System.out.println(sb);
    }

    public static void PN(int n) {
        ArrayList<Integer> div = new ArrayList<>();
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
                div.add(i);
            }
        }

        if (n == sum) {
            sb.append(n).append(" = ");

            for (int i = 0; i < div.size(); i++) {
                sb.append(div.get(i));

                if (i != div.size() - 1) {
                    sb.append(" + ");
                } else {
                    sb.append("\n");
                }
            }
        } else {
            sb.append(n).append(" is NOT perfect.").append("\n");
        }
    }
}