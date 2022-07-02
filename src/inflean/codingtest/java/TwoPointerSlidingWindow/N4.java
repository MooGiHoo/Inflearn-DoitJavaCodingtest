package inflean.codingtest.java.TwoPointerSlidingWindow;

import java.io.*;
import java.util.StringTokenizer;


public class N4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 개수
        int m = Integer.parseInt(st.nextToken()); // 합의 값
        int[] narr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            narr[i] = Integer.parseInt(st.nextToken());
        }
        int answer = 0;
        int sum = 0;
        int lt = 0;
        for(int rt = 0; rt<n; rt++){
            sum+=narr[rt];
            if(sum==m) answer++;
            while(sum>=m){
                sum-=narr[lt++];
                if(sum==m) answer++;
            }
        }
        System.out.println(answer);
    }
}