package JavaDoit;
import java.util.*;

public class j2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        int max=0;
        int sum=0;
        for(int i=0; i<N; i++){
            max = arr[i];
            if(arr[i]> max) max = arr[i];
            sum = sum + arr[i];
        }
        System.out.println(sum*100.0/N/max);
    }
}
