package inflean.codingtest.java.sorting;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class chulsu {
    public static ArrayList<Integer> solve(int size, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int tmp[] = arr.clone();
        Arrays.sort(tmp);
        for(int i=0; i<size; i++){
            if(arr[i]!=tmp[i]){
                answer.add(i+1);
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
        for(int x : solve(size, arr)){
            System.out.print(x+" ");
        }
    }
}

//깊은 복사 clone();
