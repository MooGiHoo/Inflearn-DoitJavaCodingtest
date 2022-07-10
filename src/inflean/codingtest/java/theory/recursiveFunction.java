package inflean.codingtest.java.theory;

import java.util.*;

public class recursiveFunction {
    public static void recursive(int n) {
        if(n==0) return;
        else{
            recursive(n - 1);
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args){
        recursive(3);
    }
}


//재귀함수를 DFS로 하는 경우