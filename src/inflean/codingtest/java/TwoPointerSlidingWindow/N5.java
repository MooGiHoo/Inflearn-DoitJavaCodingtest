package inflean.codingtest.java.TwoPointerSlidingWindow;

import java.io.*;

public class N5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] narr = new int[n+1];
        for(int i=1; i<n+1; i++){
            narr[i] = i;
        }
        int pl = 1;
        int pr = 1;
        int sum = 0;
        int cnt = 0;
        while(pr<n){
            if(sum==n){
                cnt++;
                sum = sum + narr[pr++] - narr[pl++];
            }
            else if(sum<n){
                sum += narr[pr++];
            }
            else{
                sum -= narr[pl++];
            }
        }
        System.out.println(cnt);
    }
}