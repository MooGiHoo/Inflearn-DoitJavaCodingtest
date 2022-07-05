package inflean.codingtest.java.StackandQueue;

import java.util.*;
import java.io.*;

class Person {
    int id;
    int priority;
    public Person(int id, int priority){
        this.id = id;
        this.priority = priority;
    }
}

public class N8 {
    public static int solve(int n, int m, int[] arr){
        int answer = 0;
        Queue<Person> queue = new LinkedList<>();
        for(int i=0; i<n; i++){
            queue.offer(new Person(i, arr[i]));
        }
        while(!queue.isEmpty()){
            Person tmp = queue.poll();
            for(Person x : queue){
                if(x.priority>tmp.priority){
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp!=null){
                answer++;
                if(tmp.id==m) return answer;
            }
        }
        return answer;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solve(n, m, arr));
    }
}