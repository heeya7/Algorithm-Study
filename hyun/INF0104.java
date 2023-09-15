package hyun;

import java.util.Scanner;

public class INF0104 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for (int i=0; i<num; i++){
            StringBuilder word = new StringBuilder(scan.next());
            System.out.println("word reverse = " + word.reverse());
        }
    }
}
