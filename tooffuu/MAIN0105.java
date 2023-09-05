package tooffuu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 5. 특정 문자 뒤집기
        영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
        특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

        [입력]
        첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.

        [출력]
        첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.

        [예시 입력]       [예시 출력]
        a#b!GE*T@S      S#T!EG*b@a
 */
public class MAIN0105 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s = bf.readLine();
        char[] arr = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            // 문자열 일 때
            if (Character.isLetter(arr[i])) {
                sb.append(arr[i]);
            }
        }
        sb.reverse();

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLetter(arr[i])) {
                arr[i] = sb.charAt(j);
                j++;
            }
        }
        System.out.println(String.valueOf(arr));
    }
}