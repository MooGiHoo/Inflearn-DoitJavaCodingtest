package inflean.codingtest.java.sorting;

import java.util.*;
import java.io.*;

public class findDuplication {
    public static Character solve(int size, int[] arr) {
        char answer = 'U';
        for(int i=0; i<size-1; i++){
            int index = arr[i];
            for(int j=i+1; j<size; j++){
                if(index == arr[j]) return 'D';
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solve(size, arr));
    }
}
