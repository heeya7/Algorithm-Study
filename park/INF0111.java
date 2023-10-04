package park;

import java.util.Scanner;

public class INF0111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next().toUpperCase();
        s = s + " ";

        INF0111 inf = new INF0111();
        System.out.println(inf.solution(s));
    }

    public String solution(String s) {
        String answer = "";
        int cnt = 1;

        for (int i = 0; i < s.length() - 1; i++) {
//            System.out.println("s.charAt(i) + \" / \" + s.charAt(i+1) = " + s.charAt(i) + " / " + s.charAt(i+1));

            if(s.charAt(i) == s.charAt(i+1)) {
                cnt++;
            }else {
                answer += s.charAt(i);
                //1보다 클 때만 숫자 붙여야함
                if(cnt > 1) {
                    answer += cnt;
                    cnt = 1;
                }
            }
        }

        return answer;
    }
}
