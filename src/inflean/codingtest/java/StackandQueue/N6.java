package inflean.codingtest.java.StackandQueue;

import java.util.*;
import java.io.*;

public class N6 {
    public static int solve(int n, int k){
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=n; i++){
            queue.offer(i);
        }
        while(!queue.isEmpty()){
            for(int i=1; i<k; i++){
                queue.offer(queue.poll());
            }
            queue.poll();
            if(queue.size()==1){
                answer = queue.poll();
            }
        }
        return answer;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        System.out.println(solve(n,k));
    }
}