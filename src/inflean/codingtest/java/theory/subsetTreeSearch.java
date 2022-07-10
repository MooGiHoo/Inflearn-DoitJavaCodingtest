//package inflean.codingtest.java.theory;
//
//import java.io.*;
//
//public class subsetTreeSearch {
//    static int n;
//    static int[] check;
//    public static void DFS(int L){
//        if(L == n+1){
//            String tmp = "";
//            for(int i=1; i<=n; i++){
//                if(check[i] == 1) tmp += (i +" ");
//            }
//            if(tmp.length()>0) System.out.println(tmp);
//        }
//        else{
//            check[L] = 1;
//            DFS(L+1);
//            check[L] = 0;
//            DFS(L+1);
//        }
//    }
//
//    public static void main(String[] args) throws IOException{
//        inflean.codingtest.java.Main t = new inflean.codingtest.java.Main();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        n = Integer.parseInt(br.readLine());
//        check = new int[n+1];
//        t.DFS(1);
//    }
//}
