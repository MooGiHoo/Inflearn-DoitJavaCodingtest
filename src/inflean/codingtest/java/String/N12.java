package inflean.codingtest.java.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String str = br.readLine().replace('#','1').replace('*','0');
        String answer = "";
        for(int i=0; i<num; i++){
            String sstr = str.substring(0,7);
            int nstr = Integer.parseInt(sstr,2);
            answer += (char)nstr;
            str = str.substring(7);
        }
        System.out.println(answer);
    }
}

//substring(begin, last) // begin부터 last전까지
//Integer.parseInt(String, radix) radix는 진수, 2 10 16  default는 10