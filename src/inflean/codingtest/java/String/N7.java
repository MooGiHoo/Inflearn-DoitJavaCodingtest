package inflean.codingtest.java.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine().toLowerCase();
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
