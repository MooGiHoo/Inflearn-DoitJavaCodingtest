package inflean.codingtest.java.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        String answer = String.valueOf(arr[0]);
        for(int i=1; i<num; i++){
            if(arr[i-1]<arr[i]) answer += " " +String.valueOf(arr[i]);
        }
        System.out.println(answer);
    }
}
