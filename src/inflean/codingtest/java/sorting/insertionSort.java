package inflean.codingtest.java.sorting;


import java.util.*;
import java.io.*;

public class insertionSort {
    public static int[] sorting(int n, int[] narr) {
        for(int i=1; i<n; i++){
            int tmp = narr[i], j;
            for(j=i-1; j>=0; j--){
                if(narr[j]>tmp) narr[j+1] = narr[j];
                else break;
            }
            narr[j+1] = tmp;
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

