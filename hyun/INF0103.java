package hyun;

import java.util.Scanner;

public class INF0103 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split(" ");
        String longWord = "";

        for (String word : words)
            if(word.length() > longWord.length())
                longWord = word;

        System.out.println("longWord = " + longWord);

        scan.close();
    }   
}
