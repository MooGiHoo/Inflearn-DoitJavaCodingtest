package inflean.codingtest.java.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        char key = st.nextToken().charAt(0);
        char[] ch = str.toCharArray();
        int[] nch = new int[ch.length];
        int p = 1000;
        for(int i=0; i<ch.length; i++){
            if(ch[i]==key){
                p = 0;
                nch[i] = p;
            }
            else{
                p++;
                nch[i] = p;
            }
        }
        p = 1000;
        for(int i=ch.length-1; i>=0; i--){
            if(ch[i]==key){
                p = 0;
            }
            else{
                p++;
                nch[i] = Integer.min(nch[i],p);
            }
        }
        for(int i=0; i<nch.length; i++){
            System.out.print(nch[i]+" ");
        }
    }
}
