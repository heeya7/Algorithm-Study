package park;

import java.util.Scanner;

public class INF0104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = s.length(); j > 0; j--) {
                System.out.printf(String.valueOf(s.charAt(j-1)));
            }
            System.out.println();
        }
    }
}
