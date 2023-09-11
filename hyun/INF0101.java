package hyun;

import java.util.Scanner;

public class INF0101 {
    public static void main(String[] args) {

        // 입력 도구 준비
        Scanner scan = new Scanner(System.in);

        String str = scan.next().toLowerCase();
        char findAlphabet = scan.next().charAt(0);
        findAlphabet = Character.toLowerCase(findAlphabet);
        int result = 0;
        
        for (char c : str.toCharArray()) {
            if(c == findAlphabet)
                result++;
        }

        System.out.println("result = " + result);

    }
}
