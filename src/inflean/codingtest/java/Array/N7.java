package inflean.codingtest.java.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] narr = new int[num];
        for(int i=0; i<num; i++){
            narr[i] = Integer.parseInt(st.nextToken());
        }
        int[] sarr = new int[num];
        int sum = 0;
        if(narr[0]==1) sarr[0] = 1;
        else sarr[0] =0;
        for(int i=1; i<num; i++){
            if(narr[i]==1){
                if(1<=sarr[i-1]){
                    sarr[i] = sarr[i-1] +1;
                }
                else{
                    sarr[i] = 1;
                }
            }
            else sarr[i] = 0;
        }
        for(int i=0; i<num; i++){
            sum += sarr[i];
        }
        System.out.println(sum);
    }
}
