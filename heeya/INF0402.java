import java.util.HashMap;
import java.util.Scanner;

public class INF0402 {
    public static String solution(String str1, String str2) {
        String answer = "YES";
        HashMap<Character,Integer> map = new HashMap<>();

        // 1. 첫번째 문자열을 HashMap<문자,해당문자개수> 에 담는다.
        for(char x1 : str1.toCharArray()) {
            map.put(x1, map.getOrDefault(x1,0)+1);
        }

        // 2. 두번째 문자열의 문자가 HashMap의 key로 존재하는지 확인한다.
        for(char x2 : str2.toCharArray()) {
            if(!map.containsKey(x2) || map.get(x2)==0) {
                answer = "NO";
                return answer;
            } else {
                map.put(x2, map.get(x2)-1);
            }
        }

        //3. 아나그램이라면 HashMap의 모든 value가 0이다.
        for(Integer i : map.values()) {
            if(i != 0) {
                answer = "NO";
                return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str1 = kb.next();
        String str2 = kb.next();

        System.out.println(solution(str1, str2));

    }
}
