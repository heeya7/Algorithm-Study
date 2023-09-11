import java.util.Scanner;

public class INF0107V1 {

    public static String solution(String str) {
        String answer = "YES";

        char[] charArr = str.toLowerCase().toCharArray();
        int lt = 0, rt = str.length()-1;

        while(lt < rt) {
            if(charArr[lt] != charArr[rt]) {
                answer = "NO";
                return answer;
            } else if(charArr[lt] == charArr[rt]) {
                lt++;
                rt--;
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
