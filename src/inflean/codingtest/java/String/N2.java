package inflean.codingtest.java.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] ch = str.toCharArray();
        String answer = "";
        for(int i=0; i<ch.length; i++){
            if((ch[i]-'a')<0) ch[i] = Character.toLowerCase(ch[i]);
            else  ch[i] = Character.toUpperCase(ch[i]);
        }
        for(int i=0; i<ch.length; i++){
            System.out.print(ch[i]);
        }
    }
}