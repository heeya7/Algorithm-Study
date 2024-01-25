package park.sec1;

import java.util.Scanner;

public class INF0101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        String str2 = sc.next().toUpperCase();
        //char c = sc.next().char(0) - solutionT

        INF0101 inf = new INF0101();
        System.out.println(inf.solution(str, str2));
        System.out.println(inf.solutionT(str, str2.charAt(0)));
    }

    public int solution(String str, String str2) {
        int cnt = str.length() - str.replace(str2, "").length();
        return cnt;
    }

    public int solutionT(String str, char c) {
        int cnt = 0;
        for (char ch : str.toCharArray()) {
            if(ch == c) {
                cnt++;
            }
        }
        return cnt;
    }
}
