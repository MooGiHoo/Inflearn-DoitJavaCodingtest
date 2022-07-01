package inflean.codingtest.java.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] narr = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<num; i++){
            narr[i] = Integer.parseInt(st.nextToken());
        }
        int max = narr[0];
        int cnt = 1;
        for(int i=1; i<num; i++){
            if(max<narr[i]){
                max = narr[i];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}