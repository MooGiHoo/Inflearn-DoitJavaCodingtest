package inflean.codingtest.java;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] sstr = str.split(" ");
        int maxn = sstr[0].length();
        String maxs = sstr[0].toString();
        for(int i=1; i<sstr.length; i++){
            if(sstr[i].length()>maxn){
                maxn = sstr[i].length();
                maxs = sstr[i].toString();
            }
        }
        System.out.println(maxs);
    }
}
