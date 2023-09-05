package tooffuu;

import java.io.*;
import java.util.ArrayList;

/* 6. 중복문자제거
        소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
        중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.

        [입력]
        첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.

        [출력]
        첫 줄에 중복문자가 제거된 문자열을 출력합니다.

        [예시 입력]       [예시 출력]
        ksekkset           kset
 */
public class MAIN0106 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> arrayList = new ArrayList<>();

        String s = bf.readLine();
        String[] sArr = s.split("");

        for (int i = 0; i < sArr.length; i++) {
            if (arrayList.size() > 0) {
                if (!arrayList.contains(sArr[i])) {
                    arrayList.add(sArr[i]);
                }
            } else {
                arrayList.add(sArr[i]);
            }
        }

        for(int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));
        }
    }
}