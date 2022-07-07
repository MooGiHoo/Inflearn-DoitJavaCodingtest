package inflean.codingtest.java.sorting;

import java.util.*;
import java.io.*;

public class DecisionAlgorithm1 {
    public static int count(int[] arr, int capacity){
        int cnt = 1;
        int sum = 0;
        for(int x : arr){
            if(sum+x>capacity){
                cnt++;
                sum = x;
            }
            else{
                sum+=x;
            }
        }
        return cnt;
    }

    public static int solve(int n,int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(count(arr, mid)<=m){
                answer = mid;
                rt = mid -1;
            }
            else{
                lt = mid+1;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solve(n,m,arr));
    }
}