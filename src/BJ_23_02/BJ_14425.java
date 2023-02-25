// HashSet 활용 (빠름)
package BJ_23_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BJ_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> hash = new HashSet<>();

        for (int i = 0; i < n; i++) {
            hash.add(br.readLine());
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            if (hash.contains(br.readLine())) {
                count++;
            }
        }

        System.out.println(count);
    }
}

//// String[] 활용 (느림)
//package BJ_23_02;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class BJ_14425 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//
//        String[] arr = new String[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = br.readLine();
//        }
//
//        int count = 0;
//
//        for (int i = 0; i < m; i++) {
//            String str = br.readLine();
//
//            for (String s : arr) {
//                if (str.equals(s)) {
//                    count++;
//                    break;
//                }
//            }
//        }
//
//        System.out.println(count);
//    }
//}