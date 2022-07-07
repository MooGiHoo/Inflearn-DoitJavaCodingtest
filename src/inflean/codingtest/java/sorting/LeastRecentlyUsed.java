package inflean.codingtest.java.sorting;

import java.util.*;
import java.io.*;

public class LeastRecentlyUsed {
    public static String solve(int size, int n,int[] arr) {
        int[] cache = new int[size];
        for (int i = 0; i < n; i++) {
            int index = arr[i];
            int pos = -1;
            for (int j = 0; j < size; j++) {
                if (index == cache[j]) pos = j;
            }
            if (pos == -1) {
                for(int j = size - 1; j >= 1; j--) {
                    cache[j] = cache[j-1];
                }
            }
            else{
                for(int j=pos; j>=1; j--){
                    cache[j] = cache[j-1];
                }
            }
            cache[0] = index;
        }
        String answer = "";
        for(int i=0; i<size; i++){
            answer += cache[i] + " ";
        }
        return answer;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solve(size, n, arr));
    }
}