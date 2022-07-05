package inflean.codingtest.java.Hash;


import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class N3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] narr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            narr[i] = Integer.parseInt(st.nextToken());
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<k-1; i++){
            map.put(narr[i], map.getOrDefault(narr[i],0)+1);
        }
        int lt=0;
        for(int rt = k-1; rt<n; rt++){
            map.put(narr[rt],map.getOrDefault(narr[rt],0)+1);
            bw.append(map.size()+" ");
            map.put(narr[lt], map.get(narr[lt])-1);
            if(map.get(narr[lt])==0) map.remove(narr[lt]);
            lt++;
        }
        bw.flush();
        bw.close();
        br.close();
    }
}