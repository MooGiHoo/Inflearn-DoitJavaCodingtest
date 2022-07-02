package inflean.codingtest.java.TwoPointerSlidingWindow;

import java.io.*;
import java.util.StringTokenizer;


public class N3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] narr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            narr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += narr[i];
        }
        int answer = sum;
        for(int i=k; i<n; i++){
            sum = sum +narr[i]-narr[i-k];
            answer = Math.max(answer, sum);
        }
        System.out.println(answer);
    }
}
