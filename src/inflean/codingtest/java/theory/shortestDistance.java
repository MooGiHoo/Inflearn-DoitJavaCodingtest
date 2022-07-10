package inflean.codingtest.java.theory;

import java.util.*;
import java.io.*;

public class shortestDistance {
    static int[] distance = {1, -1, 5};
    static int[] ch;
    public int solving(int s, int e){
        ch = new int[10001];
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        ch[s] = 1;
        int L = 0;
        while(!q.isEmpty()){
            int len = q.size();
            for(int i=0; i<len; i++){
                int x = q.poll();
                for(int j=0; j<distance.length; j++){
                    int nx = x+distance[j];
                    if(nx>=1&&nx<=10000&&ch[nx]==0){
                        ch[nx] = 1;
                        q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }
    public static void main(String[] args) throws IOException{
        shortestDistance t = new shortestDistance();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        System.out.println(t.solving(s, e));
    }
}