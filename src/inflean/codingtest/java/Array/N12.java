package inflean.codingtest.java.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int stunum = Integer.parseInt(st.nextToken());
        int test = Integer.parseInt(st.nextToken());
        int narr[][] = new int[test][stunum];
        for(int i=0; i<test; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<stunum; j++) {
                narr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int answer = 0;
        for(int i=1; i<=stunum; i++){
            for(int j=1; j<=stunum; j++){
                int cnt = 0;
                for(int k=0; k<test; k++){
                    int pi = 0, pj=0;
                    for(int s=0; s<stunum; s++){
                        if(narr[k][s]==i) pi = s;
                        if(narr[k][s]==j) pj = s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt==test) answer ++;
            }
        }
        System.out.println(answer);
    }
}