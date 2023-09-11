import java.util.Scanner;

public class INF0103 {

    public static String solution(String str) {
        String answer = "";
        int maxLen = 0;
        String[] strArr = str.split(" ");

        for(String x : strArr) {
            int len = x.length();
            if(len > maxLen) {
                maxLen = len;
                answer = x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(solution(str));
    }
}
