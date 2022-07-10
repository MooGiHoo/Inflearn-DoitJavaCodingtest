package inflean.codingtest.java.theory;

public class recursiveBinary {
    public static void recursive(int n) {
        if(n==0) return;
        else{
            recursive(n/2);
        }
    }
    public static void main(String[] args){
        recursive(3);
    }
}