import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<String> solution(int n, String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();

        for(String x : strArr) {
            char[] strTocharArr = x.toCharArray();
            int lt = 0, rt = x.length()-1; // 0번 index부터 시작이니까 -1

            while (lt < rt) {
                char tmp = strTocharArr[lt];
                strTocharArr[lt] = strTocharArr[rt];
                strTocharArr[rt] = tmp;
                lt++;
                rt--;
            }

            /**
             * 오답 : toString() 메서드는 객체의 해시코드를 포함한 문자열을 반환한다
             */
            // answer.add(strTocharArr.toString());

            /**
             * 정답
             */
            String tmp = String.valueOf(strTocharArr);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] strArr = new String[n];

        for(int i=0; i<n; i++) {
            strArr[i] = kb.next();
        }

        for(String x : solution(n, strArr)) {
            System.out.println(x);
        }

    }
}
