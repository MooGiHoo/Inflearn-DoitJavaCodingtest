package inflean.codingtest.java.StackandQueue;

import java.util.*;
import java.io.*;

public class N5 {
    public static int solve(String str){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='(') stack.push('(');
            else{
                stack.pop();
                if(str.charAt(i-1)=='(') answer += stack.size();
                else answer ++;
            }
        }
        return answer;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solve(str));
    }
}