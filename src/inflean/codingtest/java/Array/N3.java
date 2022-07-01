package inflean.codingtest.java.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] aarr = new int[num];
        for(int i=0; i<num; i++){
            aarr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int[] barr = new int[num];
        for(int i=0; i<num; i++){
            barr[i] = Integer.parseInt(st.nextToken());
        }
        String answer = "";
        for(int i=0; i<num; i++){
            if((aarr[i]==barr[i])) answer += "D\n";
            else if((aarr[i]==1&&barr[i]==3)||(aarr[i]==2&&barr[i]==1)||(aarr[i]==3&&barr[i]==2)) answer += "A\n";
            else answer += "B\n";
        }
        System.out.println(answer);
    }
}
