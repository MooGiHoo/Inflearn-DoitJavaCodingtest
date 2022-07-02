package inflean.codingtest.java.TwoPointerSlidingWindow;

import java.io.*;
import java.util.StringTokenizer;

public class N6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] narr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            narr[i] = Integer.parseInt(st.nextToken());
        }
        int pl=0;
        int cnt = 0;
        int answer = 0;
        for(int pr=0; pr<n; pr++){
            if(narr[pr]==0) cnt++;
            while(cnt>k){
                if(narr[pl]==0) cnt--;
                pl++;
            }
            answer = Math.max(answer,pr-pl+1);
        }
        System.out.println(answer);
    }
}