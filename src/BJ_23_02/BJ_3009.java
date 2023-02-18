// 구글링 참고 코드
package BJ_23_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] xy1 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine());
        int[] xy2 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine());
        int[] xy3 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        int x, y;

        if (xy1[0] == xy2[0]) { // x 좌표 구하기
            x = xy3[0];
        } else if (xy1[0] == xy3[0]) {
            x = xy2[0];
        } else {
            x = xy1[0];
        }

        if (xy1[1] == xy2[1]) { // y 좌표 구하기
            y = xy3[1];
        } else if (xy1[1] == xy3[1]) {
            y = xy2[1];
        } else {
            y = xy1[1];
        }

        System.out.println(x + " " + y);
    }
}

//// 내가 짠 별로인 코드
//package BJ_23_02;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class BJ_3009 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int[] x = new int[1001];
//        int[] y = new int[1001];
//        int X = 0, Y = 0;
//
//        for (int i = 0; i < 3; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//
//            x[Integer.parseInt(st.nextToken())]++;
//            y[Integer.parseInt(st.nextToken())]++;
//        }
//
//        for (int i = 1; i <= 1000; i++) {
//            if (x[i] == 1) {
//                X = i;
//            }
//
//            if (y[i] == 1) {
//                Y = i;
//            }
//        }
//
//        System.out.println(X + " " + Y);
//    }
//}