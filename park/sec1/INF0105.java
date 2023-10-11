package park.sec1;

import java.util.Scanner;

public class INF0105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        INF0105 inf = new INF0105();
        System.out.println(inf.solution(s));
    }

    public String solution(String s) {
        String answer = "";
        char[] c = s.toCharArray();
        int lt = 0, rt = s.length() - 1;

        while(lt < rt) {
            if(!Character.isAlphabetic(c[lt])) {
                lt++;
            }else if(!Character.isAlphabetic(c[rt])) {
                rt--;
            }else {
                char temp = c[lt];
                c[lt] = c[rt];
                c[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c);

        return answer;
    }
}
