package inflean.codingtest.java.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] narr = new int[num+1];
        int cnt = 0;
        for(int i=2; i<=num; i++){
            if(narr[i]==0) {
                cnt++;
            }
            for(int j=i; j<=num; j=j+i) {
                narr[j] = 1;
            }
        }
        System.out.println(cnt);
    }
}

// 소수란 약수가 자신과 1만 있는 수
// ex 2 , 3 ,5 ,7 ...
// 소수를 구하기 위해서는 에라토스테네스 체를 사용한다
// 배열을 통하여 2를 구하고 2의 배수인 것들에 모두 flase값을 대입한다.

