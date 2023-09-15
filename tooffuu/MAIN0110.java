package tooffuu;

import java.io.*;

/* 10. 가장 짧은 문자거리
        한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.

        [입력]
        첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
        문자열의 길이는 100을 넘지 않는다.

        [출력]
        첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.

        [예시 입력]                                         [예시 출력]
        teachermode e                                      1 0 1 2 1 0 1 2 2 1 0
 */
public class MAIN0110 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        String str1 = str.split(" ")[0];
        char s = str.split(" ")[1].charAt(0);
        int[] answer = new int[str1.length()];

        int v = 1000;

        // 왼쪽부터 거리 계산
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == s) {
                v = 0;
            } else {
                v++;
                answer[i] = v;
            }
        }

        // 오른쪽부터 거리 계산
        for (int i = str1.length() - 1; i >= 0; i--) {
            if (str1.charAt(i) == s) {
                v = 0;
            } else {
                v++;
                answer[i] = Math.min(answer[i], v);
            }
        }

        for (int x : answer) {
            System.out.print(x + " ");
        }
    }
}