package BJ_23_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum_grade = 0.0;
        double sum_score = 0.0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            st.nextToken(); // 사용 X
            double grade = Double.parseDouble(st.nextToken()); // 학점
            String score = st.nextToken(); // 점수

            if (!score.equals("P")) {
                sum_grade += grade; // 총 학점 합산
            }

            switch (score) { // 총 점수 합산 (JAVA 11 : 향상된 Switch 문 활용 불가능)
                case "A+":
                    sum_score += grade * 4.5; break;
                case "A0":
                    sum_score += grade * 4.0; break;
                case "B+"
                    :sum_score += grade * 3.5; break;
                case "B0":
                    sum_score += grade * 3.0; break;
                case "C+":
                    sum_score += grade * 2.5; break;
                case "C0":
                    sum_score += grade * 2.0; break;
                case "D+":
                    sum_score += grade * 1.5; break;
                case "D0":
                    sum_score += grade; break;
                case "F":
                    sum_score += grade * 0.0;
            }
        }

        System.out.println(sum_score / sum_grade);
    }
}