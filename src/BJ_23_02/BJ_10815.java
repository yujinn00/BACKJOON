// 이분 탐색 활용
package BJ_23_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_10815 {
    public static int n, m;
    public static int[] arr = new int[n];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());

            if (binary_search(target, 0, n - 1)) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }

        System.out.println(sb);
    }

    public static boolean binary_search(int target, int left, int right) {
        if (left > right) {
            return false;
        }

        int mid = (left + right) / 2;

        if (arr[mid] == target) {
            return true;
        } else if (arr[mid] > target) {
            return binary_search(target, left, mid - 1);
        } else {
            return binary_search(target, mid + 1, right);
        }
    }
}