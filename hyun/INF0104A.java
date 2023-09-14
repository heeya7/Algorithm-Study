package hyun;

import java.util.Scanner;

public class INF0104A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for (int i=0; i<num; i++){
            char[] word = scan.next().toCharArray();
            for(int j=0; j<word.length; j++)
                System.out.print(word[word.length-(j+1)]);
            System.out.println();
        }
    }
}
