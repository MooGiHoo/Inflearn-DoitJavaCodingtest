package inflean.codingtest.java.Array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] narr = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            narr[i] = Integer.parseInt(st.nextToken());
        }
        String answer = "";
        int[] garr = new int[num];
        for(int i = 0; i < num; i++){
            int grade = 1;
            for (int j = 0; j < num; j++){
                if(narr[i]<narr[j]) grade++;
            }
            garr[i] = grade;
            answer += String.valueOf(garr[i]) + " ";
        }
        System.out.println(answer);
    }
}
