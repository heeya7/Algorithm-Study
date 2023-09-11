import java.util.Scanner;

public class INF0108 {
    public static String solution(String str) {
        String answer = "NO";

        // replace는 정규식 사용 불가, replaceAll은 정규식 사용 가능
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        String tmp = new StringBuilder(str).reverse().toString();

        if(tmp.equals(str)) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(solution(str));

    }
}
