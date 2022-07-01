package inflean.codingtest.java.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int narr[][] = new int[num][num];
        for(int i=0; i<num; i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            for(int j=0; j<num; j++){
                narr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int answer = 0;
        for (int i = 0; i < num; i++) {
            int width = 0;
            int height = 0;
            for (int j = 0; j < num; j++) {
                width += narr[i][j];
                height += narr[j][i];
            }
            answer = Integer.max(answer, width);
            answer = Integer.max(answer, height);
        }

        int dia1 = 0;
        int dia2 = 0;
        for(int i=0; i<num; i++){
            dia1 += narr[i][i];
            dia2 += narr[num-1-i][num-1-i];
        }
        answer = Integer.max(answer, dia1);
        answer = Integer.max(answer, dia2);

        System.out.println(answer);
    }
}



//비교 연산은 총 2n + 2
//for문은 n^2
// 2n^2 + 2n + 2