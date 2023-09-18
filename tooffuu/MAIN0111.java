package tooffuu;

import java.io.*;
import java.util.ArrayList;

/* 11. 문자열 압축
        알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
        문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
        단 반복횟수가 1인 경우 생략합니다.

        [입력]
        첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.

        [출력]
        첫 줄에 압축된 문자열을 출력한다.

        [예시 입력]                    [예시 출력]
        KKHSSSSSSSE                   K2HS7E
        KSTTTSEEKFKKKDJJGG            KST3SE2KFK3DJ2G2
 */
public class MAIN0111 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> arrayList = new ArrayList<>();

        String str = bf.readLine();
        str = str + " ";
        String[] sArr = str.split("");

        int answer = 0;
        String result = "";

        for (int i = 0; i < sArr.length -1 ; i++) {
            answer++;

            if (!sArr[i].equals(sArr[i + 1])) {
                if (answer == 1) {
                    result += sArr[i];
                    answer = 0;
                } else {
                    result += sArr[i] + answer;
                    answer = 0;
                }
            }
        }
        System.out.println(result);
    }
}