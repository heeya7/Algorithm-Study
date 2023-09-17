package hyun;

import java.util.Scanner;

public class INF0108 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 정규식을 통해 알파벳 소문자와 대문자만 갖는 문자열로 반환
        String str = scan.nextLine().replaceAll("[^a-zA-Z]", "").toLowerCase();
        char[] charArr = str.toCharArray();

        int size = charArr.length;
        boolean result = true;

        for(int i=0; i<size; i++)
            if (charArr[i] != charArr[(size - 1) - i])
                result = false;

        System.out.println("result = " + result);

        scan.close();
    }
}
