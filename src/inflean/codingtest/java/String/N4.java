package inflean.codingtest.java.String;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];
        for(int i=0; i<n; i++) str[i] = br.readLine();
        for(int i=0; i<n; i++){
            StringBuffer sb = new StringBuffer(str[i]);
            str[i] = sb.reverse().toString();
            System.out.println(str[i]);
        }
    }
}

//reverse()를 사용하기 위해서는  StringBuffer나 StringBuilder를 사용해야 한다.
//String과의 차이점은 Sring은 immutable이고 위는 mutable이다.
