package inflean.codingtest.java.Hash;

import java.io.*;
import java.util.HashMap;

public class N1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String str = br.readLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char x : str.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1); // 중요
        }
        char answer = ' ';
        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
            if(map.get(key)>max){
                max = map.get(key);
                answer = key;
            }
        }
        System.out.println(answer);
    }
}


//getOrDefault x의 키 값을 가져오되, x의 값이 없으면 defaultValue를 가져온다
//위의 코드는 x로 key를 가져왔는데 처음으로 A의 값이 들어옴.. 그럼 이 값은 일단 0이고 가져왔으니 +1을 해주는 것이다.
//map.keySet() 키들을 하나씩 순회한다.

//Map에 특정 키가 존재하냐? map.containsKey() ->bool값
//Key수가 궁금? map.size()
//제거하고 싶어? map.remove('a')