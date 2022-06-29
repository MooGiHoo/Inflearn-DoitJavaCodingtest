package JavaDoit;
import java.util.*;

public class j1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String snum = sc.next();
        char[] cnum = snum.toCharArray();
        int answer = 0;
        for(int i=0; i<N; i++){
            answer += (cnum[i]-48);
        }
        System.out.println(answer);
    }
}

// 문자열을 숫자형으로 변경하려면 -48 or -'0' 한다.

