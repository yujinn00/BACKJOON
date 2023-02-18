/*
행성계 안에 출발점만 있거나 도착점만 있는 경우, count 증가
행성계 안에 출발점과 도착점 둘 다 있는 경우, count 불변
*/
package BJ_23_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 입력

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken()); // 출발점 x 좌표 입력
            int y1 = Integer.parseInt(st.nextToken()); // 출발점 y 좌표 입력
            int x2 = Integer.parseInt(st.nextToken()); // 도착점 x 좌표 입력
            int y2 = Integer.parseInt(st.nextToken()); // 도착점 y 좌표 입력

            int n = Integer.parseInt(br.readLine()); // 행성계 개수 입력
            int count = 0; // 최소 행성계 진입 및 이탈 횟수 초기화

            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());

                int x = Integer.parseInt(st.nextToken()); // 행성계 중점 x 좌표 입력
                int y = Integer.parseInt(st.nextToken()); // 행성계 중점 y 좌표 입력
                int r = Integer.parseInt(st.nextToken()); // 행성계 반지름 입력

                double start_dis = Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2)); // 출발점과 행성계 중점 사이의 거리
                double end_dis = Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2)); // 도착점과 행성계 중점 사이의 거리

                if (start_dis < r && end_dis > r) { // 행성계 안에 출발점만 있는 경우, 증가
                    count++;
                } else if (end_dis < r & start_dis > r) { // 행성계 안에 도착점만 있는 경우, 증가
                    count++;
                }
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }
}