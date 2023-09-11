import java.util.ArrayList;
import java.util.Scanner;

public class INF0104V1 {
    public static ArrayList<String> solution(int n, String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();

        /**
         * StringBuilder를 이용하는 이유 : String은 변경 불가능한 문자열을 생성하지만 StringBuilder는 변경 가능한 문자열을 만들어준다 > 메모리부담 감소
         */
        for(String x : strArr) {
            String tmp = new StringBuilder(x).reverse().toString();
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
