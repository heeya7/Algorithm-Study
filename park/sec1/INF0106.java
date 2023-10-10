package park.sec1;

import java.util.Scanner;

public class INF0106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        INF0106 inf = new INF0106();

        System.out.println(inf.solution(s));
    }

    public String solution(String s) {
        String answer = "";
        String duplication = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(duplication.indexOf(c) < 0) {
                answer += c;
                duplication += c;
            }
        }

        return answer;
    }
}
