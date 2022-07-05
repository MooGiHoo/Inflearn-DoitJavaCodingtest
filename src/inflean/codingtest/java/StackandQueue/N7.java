package inflean.codingtest.java.StackandQueue;
import java.util.*;
import java.io.*;

public class N7 {
    public static String solve(String str1, String str2){
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();
        for(char x : str1.toCharArray()){
            queue.offer(x);
        }
        for(char x : str2.toCharArray()){
            if(queue.contains(x)){
                if(x!=queue.poll()) return "NO";
            }
        }
        if(!queue.isEmpty()) return "NO";
        else return answer;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        System.out.println(solve(str1, str2));
    }
}
