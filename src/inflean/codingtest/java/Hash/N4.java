package inflean.codingtest.java.Hash;

import java.io.*;
import java.util.HashMap;

public class N4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] sarr = br.readLine().toCharArray();
        char[] tarr = br.readLine().toCharArray();
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();
        for(int i=0; i<tarr.length; i++){
            tmap.put(tarr[i],tmap.getOrDefault(tarr[i],0)+1);
        }
        for(int i=0; i<tarr.length-1; i++){
            smap.put(sarr[i],smap.getOrDefault(sarr[i],0)+1);
        }
        int lt = 0;
        int cnt = 0;
        for(int rt = tarr.length-1; rt<sarr.length; rt++){
            smap.put(sarr[rt], smap.getOrDefault(sarr[rt],0)+1);
            if(tmap.equals(smap)){
                cnt++;
                smap.put(sarr[lt], smap.get(sarr[lt])-1);
                if(smap.get(sarr[lt])==0) smap.remove(sarr[lt]);
                lt++;
            }
            else{
                smap.put(sarr[lt], smap.get(sarr[lt])-1);
                if(smap.get(sarr[lt])==0) smap.remove(sarr[lt]);
                lt++;
            }
        }
        System.out.println(cnt);
    }
}