package park;

import java.util.Arrays;
import java.util.Scanner;

public class INF0112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        String s = sc.next();

        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            if(i % 7 == 0 && i != 0) {
                s2 += " ";
            }
            s2 += s.charAt(i);
        }

        INF0112 inf = new INF0112();
        System.out.println(inf.solution(cnt,  s2.split(" ")));
    }

    public String solution(int cnt, String[] codeArr) {
        String answer = "";

        int[] decimalArr = Arrays.stream(codeArr)
                .map(s -> s.replace("*", "0").replace("#", "1"))
                .mapToInt(binaryStr -> Integer.parseInt(binaryStr, 2))
                .toArray();

        for (int i : decimalArr) {
            answer += (char)i;
        }

        return answer;
    }
}
