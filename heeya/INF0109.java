import java.util.Scanner;

public class Main {
    public static int solution(String str) {
        String answer = "";
        char[] charArr = str.toCharArray();

        for(int i=0; i<str.length(); i++) {
            if(charArr[i] >= 48 && charArr[i] <=57) {
                answer += charArr[i];
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(solution(str));

    }
}
