package inflean.codingtest.java.StackandQueue;
import java.io.*;
import java.util.*;

public class N4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Integer> stack = new Stack<>();
        for(char x : str.toCharArray()){
            int lt, rt;
            if(Character.isDigit(x)) stack.push(x-'0');
            else{
                lt = stack.pop();
                rt = stack.pop();
                if(x == '+') stack.push(rt+lt);
                else if(x == '*') stack.push(rt*lt);
                else if(x == '/') stack.push(rt/lt);
                else stack.push(rt-lt);
            }
        }
        System.out.println(stack.pop());
    }
}