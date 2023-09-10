import java.util.Scanner;

public class INF0102 {

    public static String solution(String str) {
        String answer = "";

        for(char x : str.toCharArray()) {
            if(x >= 97) {
                // 소문자일 때
                answer += Character.toUpperCase(x);
            } else {
                // 대문자일 때
                answer += Character.toLowerCase(x);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(solution(str));
    }
}
