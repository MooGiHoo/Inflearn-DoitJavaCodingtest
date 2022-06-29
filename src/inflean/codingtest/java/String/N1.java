package inflean.codingtest.java.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase();
        char[] carr = str.toCharArray();
        char ch = br.readLine().toLowerCase().charAt(0);
        int cnt = 0;
        for(int i=0; i<carr.length; i++){
            if(carr[i]==ch) cnt++;
        }
        System.out.println(cnt);
    }
}

