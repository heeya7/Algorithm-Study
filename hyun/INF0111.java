package hyun;

import java.util.Scanner;

public class INF0111 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char prevCh = str.charAt(0);
        int count = 0;
        String result = "";

        for(char c : str.toCharArray()){
            if (prevCh == c) {
                count++;
                continue;
            }
            result += count > 1 ? String.valueOf(prevCh) + count : String.valueOf(prevCh);
            count = 1;
            prevCh = c;
        }

        result += count > 1 ? String.valueOf(prevCh) + count : String.valueOf(prevCh);
        System.out.print(result);

        scan.close();
    }
}
