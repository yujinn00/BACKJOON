package BJ_23_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            double dis = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            if (x1 == x2 && y1 == y2 && r1 == r2) { // 모두 일치하는 경우, 접점 무한대
                sb.append("-1").append("\n");
            } else if (dis > r1 + r2) { // 두 점 사이의 거리가 두 반지름의 합보다 커서 아예 만나지 않는 경우, 접점 0개
                sb.append("0").append("\n");
            } else if (dis < Math.abs(r1 - r2)) { // 두 점 사이의 거리가 두 반지름의 차보다 작아서 원 안에 원이 있는 경우, 접점 0개
                sb.append("0").append("\n");
            } else if (dis == Math.abs(r1 - r2)) { // 두 점 사이의 거리와 두 반지름의 차가 같아서 내접인 경우, 접점 1개
                sb.append("1").append("\n");
            } else if (dis == r1 + r2) { // 두 점 사이의 거리와 두 반지름의 합이 같아서 외접인 경우, 접점 1개
                sb.append("1").append("\n");
            } else { // 그 외의 모든 경우, 접점 2개
                sb.append("2").append("\n");
            }
        }

        System.out.println(sb);
    }
}