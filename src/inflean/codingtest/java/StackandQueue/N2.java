package inflean.codingtest.java.StackandQueue;

import java.io.*;
import java.util.*;

public class N2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] narr = new int[n][n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                narr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int m = Integer.parseInt(br.readLine());
        int[] moves = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            moves[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for(int pos : moves){
            for(int i=0; i<narr.length; i++){
                if(narr[i][pos-1]!=0){
                    int tmp = narr[i][pos-1];
                    narr[i][pos-1] = 0;
                    if(!stack.isEmpty()&&stack.peek()==tmp){
                       answer +=2;
                       stack.pop();
                    }
                    else stack.push(tmp);
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
