package park;

import java.util.Scanner;

public class INF0109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        INF0109 inf = new INF0109();
        System.out.println(inf.solution(s));
    }

    public int solution(String s) {
        String str = "";
        for (char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                str += c;
            }
        }

        return Integer.parseInt(str);
    }
}
