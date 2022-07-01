package inflean.codingtest.java.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] narr = new int[num+1][6];
        for (int i = 1; i <= num; i++) {  // i는 학생 수 변동
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 5; j++) {  //j는 반 수 고정
                narr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int max = 0;
        int answer = 0;
        for (int i = 1; i <= num; i++) {
            int cnt = 0;
            for (int j = 1; j <= num; j++) {
                for(int k=1; k<=5; k++){
                    if(narr[i][k]==narr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max){
                max = cnt;
                answer = i;
            }
        }
        System.out.println(answer);
    }
}

//3중 for문은 마음에 안들지만...
