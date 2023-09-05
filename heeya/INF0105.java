import java.util.Scanner;

public class Main {
    public static String solution(String str) {
        char[] charArr = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;

        while(lt < rt) {
            if(!Character.isAlphabetic(charArr[lt])) {
                lt++;
            } else if(!Character.isAlphabetic(charArr[rt])) {
                rt--;
            } else {
                char tmp = charArr[lt];
                charArr[lt] = charArr[rt];
                charArr[rt] = tmp;
                lt++;
                rt--;
            }
        }

        return String.valueOf(charArr);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(solution(str));

    }
}
