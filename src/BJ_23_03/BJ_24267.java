package BJ_23_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine());
        long sum = 0;

        if (n == 1 || n == 2) {
            System.out.println("0");
            System.out.println("3");

        } else {
            for (int i = 1; i <= n - 2; i++) {
                sum += ((long) i * (i + 1) / 2);
            }

            System.out.println(sum);
            System.out.println("3");
        }
    }
}