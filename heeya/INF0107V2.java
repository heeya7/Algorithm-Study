import java.util.Scanner;

public class Main {

    public static String solution(String str) {
        String answer = "YES";
        int len = str.length();
        str = str.toLowerCase();

        for(int i=0; i<len/2; i++) {
            if(str.charAt(i) != str.charAt(len-1-i)) {
                answer ="NO";
                return answer;
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
