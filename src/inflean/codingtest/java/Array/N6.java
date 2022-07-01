package inflean.codingtest.java.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N6 {
    public static boolean isPrime(int result){
        if(result == 1) return false;
        for(int i=2; i<result; i++){
            if(result%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] narr = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<num; i++){
            narr[i] = Integer.parseInt(st.nextToken());
        }
        String answer = "";
        for(int i=0; i<num; i++){
            int tmp = narr[i];
            int result = 0;
            while(tmp>0){
                int t = tmp%10;
                result = result*10 + t;
                tmp = tmp/10;
            }
            if(isPrime(result)){
                answer += result + " ";
            }
        }
        System.out.println(answer);
    }
}

// 꽤나 고전하고 어려운 문제
// 입력을 받고 배열의 각 숫자를 뒤집는 작업을 진행한다. 그 후 그 숫자를 isPrime 함수에 넣어 소수인지 확인한다.
// if(result == 1) return false; 는 만약 뒤집은 숫자가 1인 경우를 고려한 것이다. 100 -> 1
