package inflean.codingtest.java.StackandQueue;

import java.io.*;
import java.util.*;

public class N1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] carr = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        String answer = "YES";
        for(int i=0; i<carr.length; i++){
            if(carr[i] == '(') stack.push(carr[i]);
            else{
                if(stack.isEmpty()){
                    answer = "NO";
                    break;
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()) answer = "NO";
        System.out.println(answer);
    }
}