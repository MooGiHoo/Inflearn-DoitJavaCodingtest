package inflean.codingtest.java.Hash;

import java.io.*;
import java.util.HashMap;

public class N2 {
    public static String answer(String arr1, String arr2){
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : arr1.toCharArray()){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        for(char x : arr2.toCharArray()){
            if(!map.containsKey(x)||map.get(x)==0){
                return "NO";
            }
            else{
                map.put(x,map.get(x)-1);
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr1 = br.readLine();
        String arr2 = br.readLine();
        inflean.codingtest.java.Main N2 = new inflean.codingtest.java.Main();
//        System.out.println(N2.answer(arr1, arr2));
    }
}
