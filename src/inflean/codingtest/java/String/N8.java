package inflean.codingtest.java.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine().toLowerCase().replaceAll("[^a-z]","");
        String str2 = str1;
        char[] ch = str1.toCharArray();
        int lt = 0, rt = str1.length()-1;
        while(lt<rt){
            char tmp;
            tmp = ch[lt];
            ch[lt] = ch[rt];
            ch[rt] = tmp;
            lt++;
            rt--;
        }
        str1 = String.valueOf(ch);
        if(str1.equals(str2)) System.out.println("YES");
        else System.out.println("NO");
    }
}

//여기서는 정규식을 사용한다. replaceAll 메서드를 이용하여 a~z까지의 알파벳이 아니면 없음으로 대체하는 정규식을 사용한 것이다.
//사용된 정규식 [^a-z]  --> a-z가 아니면 이라는 뜻