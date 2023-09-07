package tooffuu;

import java.io.*;

/* 7. 회문 문자열
        앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
        문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
        단 회문을 검사할 때 대소문자를 구분하지 않습니다.

        [입력]
        첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.

        [출력]
        첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.

        [예시 입력]       [예시 출력]
          gooG             YES
 */
public class MAIN0107 {
    public static String solution(String s) {
        char[] arr = s.toLowerCase().toCharArray();

        int i = 0, j = s.length() - 1;
        String answer = "YES";

        while (i < j) {
            if (arr[i] != arr[j]) {
                answer = "NO";

                return answer;
            } else if (arr[i] == arr[j]) {
                i++;
                j--;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();

        System.out.println(solution(s));
    }
}