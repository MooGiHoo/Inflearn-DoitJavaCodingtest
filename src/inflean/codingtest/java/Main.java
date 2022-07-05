package inflean.codingtest.java;

import java.util.*;
import java.io.*;

class print {
    int num;
    int priority;
    public print(int num, int priority){
        this.num = num;
        this.priority = priority;
    }
}

public class Main {
    public static int solve(int n, int m, int[] priority) {
        int answer=0;
        Queue<print> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            q.offer(new print(i, priority[i]));
        }
        while(!q.isEmpty()){
            print tmp = q.poll();
            for(print x : q){
                if(x.priority>tmp.priority){
                    q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp!=null){
                answer++;
                if(tmp.num==m) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = "";
        int tc = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<tc; i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[] priority = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                priority[j] = Integer.parseInt(st.nextToken());
            }
            System.out.println(solve(n,m,priority));
        }
    }
}
