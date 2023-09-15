package hyun;

import java.util.Scanner;

public class INF0103A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        String longWord = "";
        int pos = Integer.MAX_VALUE;


        exit : while(pos > 0){
            // 찾고자 하는 문자를 찾으면 해당 인덱스 반환, 없으면 -1 반환
            pos = line.indexOf(" ");

            // pos가 음수라는 것은 indexOf 메서드로 찾고자 하는 문자를 못찾았다는 뜻으로 마지막 단어임을 뜻함.
            if(pos < 0){
                longWord = line.length() > longWord.length() ? line : longWord;
                break exit;
            }

            // 비교할 단어 추출
            String word  = line.substring(0, pos);

            // 단어 길이 비교
            if(word.length() > longWord.length())
                longWord = word;

            // 비교한 단어 제거
            line = line.substring(pos + 1);
        }

        System.out.println("longWord = " + longWord);

        scan.close();
    }
}
