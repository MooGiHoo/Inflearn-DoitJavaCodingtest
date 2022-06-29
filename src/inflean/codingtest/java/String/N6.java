package inflean.codingtest.java.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String answer = "";
        for(int i=0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }
        System.out.println(answer);
    }
}
// String.indexOf는 String에 존재하는 문자나 문자열의 처음 시작 위치를 알려주는 메서드다.
// indexOf는 처음 발견하는 시작 위치를 알려주기 때문에 ==i가 아니라면 이미 나왔던 문자이기 때문에 추가하지 않는 방식으로 진행한다.