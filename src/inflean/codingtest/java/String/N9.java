package inflean.codingtest.java.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] ch = str.toCharArray();
        int answer = 0;
        for(int i=0; i<ch.length; i++){
            if(48<=ch[i]&&ch[i]<=57) answer = answer*10 + (ch[i]-48);
        }
        System.out.println(answer);
    }
}

// 아스키 코드의 숫자 값인 48~57을 이용하여 푼다.
// 숫자로 변환하였기 때문에 answer += 이 아닌 answer = answer*10 으로 해야 함
//             a0b1c3          4                 13

