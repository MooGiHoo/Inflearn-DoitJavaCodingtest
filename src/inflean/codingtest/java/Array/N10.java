package inflean.codingtest.java.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int narr[][] = new int[num+2][num+2];
        for(int i=1; i<num+1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<num+1; j++){
                narr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int cnt = 0;
        for(int i=1; i<num+1; i++){
            for(int j=1; j<num+1; j++){
                if(narr[i][j]>narr[i-1][j]&&narr[i][j]>narr[i][j-1]&&narr[i][j]>narr[i+1][j]&&narr[i][j]>narr[i][j+1]){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
