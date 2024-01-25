package park.sec1;

import java.util.Scanner;

public class INF0102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        INF0102 inf = new INF0102();

        System.out.println(inf.solution(str));
        System.out.println(inf.solutionT(str));
    }

    public String solution(String str) {
        String temp = "";
        for(char c : str.toCharArray()) {
            if(Character.isUpperCase(c)){
                temp += Character.toLowerCase(c);
            }else {
                temp += Character.toUpperCase(c);
            }
        }

        return temp;
    }

    //아스키 코드 사용
    public String solutionT(String str) {
        String temp = "";
        for(char c : str.toCharArray()) {
            if(c >=  65 && c <= 90) { //대문자
                temp += (char)(c + 32);
            }else if(c >= 97 && c <= 122) { //소문자
                temp += (char)(c - 32);
            }
        }
        return temp;
    }
}
