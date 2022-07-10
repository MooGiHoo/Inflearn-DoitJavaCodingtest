package inflean.codingtest.java.theory;

public class recursiveFibonacci {
    public static int recursive(int n) {
        if(n==1) return 1;
        else if(n==2) return 1;
        else{
            return recursive(n-2)+recursive(n-1);
        }
    }
    public static void main(String[] args){
        System.out.println(recursive(7));
    }
}