package inflean.codingtest.java.TwoPointerSlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class N1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] narr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            narr[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        int[] marr = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            marr[i] = Integer.parseInt(st.nextToken());
        }
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 =0, p2 =0;
        while(p1<N && p2<M){
            if(narr[p1]<marr[p2]) answer.add(narr[p1++]);
            else answer.add(marr[p2++]);
        }
        while(p1<N) answer.add(narr[p1++]);
        while(p2<M) answer.add(marr[p2++]);
        for(int i=0; i<answer.size(); i++){
            System.out.print(answer.get(i)+" ");
        }
    }
}


//투포인터가 매우 중요한 O(N^2) --> O(nlogn)이 핵심
//