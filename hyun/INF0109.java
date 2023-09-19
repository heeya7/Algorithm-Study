package hyun;

import java.util.Scanner;

public class INF0109 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next().replaceAll("[^0-9]", "");

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '0')
                continue;
            System.out.println(str.substring(i));
            break;
        }

        scan.close();
    }
}
