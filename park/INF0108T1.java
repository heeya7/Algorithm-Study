package park;

import java.util.Scanner;

public class INF0108T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toUpperCase().replaceAll("[^A-Z]"," ");

        INF0108T1 inf = new INF0108T1();
        System.out.println(inf.solution(s));
    }

    public String solution(String s) {
        String answer = "NO";
        String temp = new StringBuilder(s).reverse().toString();
        if(s.equals(temp)) {
            answer = "YES";
        }

        return answer;
    }
}
