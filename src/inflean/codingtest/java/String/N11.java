package inflean.codingtest.java.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str + " ";
        String answer = "";
        int k =1;
        for(int i=0; i<str.length()-1; i++) {
            if(str.charAt(i)==str.charAt(i+1)) {
                k++;
            }
            else{
                if(k==1) answer += String.valueOf(str.charAt(i));
                else answer += String.valueOf(str.charAt(i))+ k;
                k=1;
            }
        }
        System.out.println(answer);
    }
}
