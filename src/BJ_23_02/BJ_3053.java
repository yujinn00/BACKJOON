package BJ_23_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_3053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int r = Integer.parseInt(br.readLine());

        System.out.println(r * r * Math.PI); // 유클리드 기하학
        System.out.println(2 * r * r); // 택시 기하학
    }
}