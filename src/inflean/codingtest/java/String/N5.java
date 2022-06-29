package inflean.codingtest.java.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String answer = "";
        char[] ch = str.toCharArray();
        int lt = 0, rt = ch.length-1;
        while(lt<rt) {
            if (!Character.isAlphabetic(ch[lt])) lt++;
            else if (!Character.isAlphabetic(ch[rt])) rt--;
            else {
                char tmp;
                tmp = ch[rt];
                ch[rt] = ch[lt];
                ch[lt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(ch);
        System.out.println(answer);
    }
}