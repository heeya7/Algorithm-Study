package hyun;

import java.util.Scanner;

public class INF0102 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String result = "";

        for (char c : str.toCharArray())
            // 65 : A ~ 89 : Z, 97 : a ~ 122 : z
            result += c < 90 ? Character.toLowerCase(c) : Character.toUpperCase(c);

        System.out.println("result = " + result);
    }
}
