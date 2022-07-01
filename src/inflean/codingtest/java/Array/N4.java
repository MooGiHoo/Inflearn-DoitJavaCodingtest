package inflean.codingtest.java.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] narr = new int[num];
        narr[0] = 1;
        narr[1] = 1;
        for(int i=2; i<num; i++){
            narr[i] = narr[i-1] + narr[i-2];
        }
        for(int i=0; i<num; i++){
            System.out.print(narr[i]+" ");
        }
    }
}
