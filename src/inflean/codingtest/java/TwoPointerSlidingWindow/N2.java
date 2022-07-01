package inflean.codingtest.java.TwoPointerSlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class N2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] narr = new int[n];
        for (int i = 0; i < n; i++) {
            narr[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        int[] marr = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            marr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(narr);
        Arrays.sort(marr);
        int p1 = 0, p2 = 0;
        String answer = "";
        while (p1 < n && p2 < m) {
            if (narr[p1] == marr[p2]) {
                answer = answer + narr[p1] + " ";
                p1++;
                p2++;
            } else if (narr[p1] > marr[p2]) p2++;
            else p1++;
        }
        System.out.println(answer);
    }
}