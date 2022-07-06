package inflean.codingtest.java.sorting;

import java.util.*;
import java.io.*;

public class selectionSort {
    public static int[] sorting(int n, int[] narr) {
        for(int i=0; i<n-1; i++){
            int index = i;
            for(int j=i+1; j<n; j++){
                if(narr[index]>narr[j]) index = j;
            }
            int tmp = narr[i];
            narr[i] = narr[index];
            narr[index] = tmp;
        }
        return narr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] narr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            narr[i] = Integer.parseInt(st.nextToken());
        }
        for(int x : sorting(n, narr)){
            System.out.print(x + " ");
        }
    }
}

