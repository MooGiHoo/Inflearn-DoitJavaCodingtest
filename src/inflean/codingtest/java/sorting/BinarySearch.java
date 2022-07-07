package inflean.codingtest.java.sorting;
import java.util.*;
import java.io.*;

public class BinarySearch {
    public static int solve(int n, int[] arr,int m) {
        int answer;
        Arrays.sort(arr);
        int start = 0;
        int end = n-1;
        while(true){
            int mid = (start+end)/2;
            if(arr[mid]==m){
                answer = mid+1;
                break;
            }
            else if(arr[mid]<m){
                start = mid +1;
            }
            else{
                end = mid -1;
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
        System.out.println(solve(n,arr,m));
    }
}