package hyun;

import java.util.Scanner;

public class INF0105 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        char[] alphabets = str.toCharArray();

        int leftIndex = 0;
        int rightIndex = alphabets.length-1;

        while(leftIndex<rightIndex){
            if(!Character.isAlphabetic(alphabets[leftIndex]))
                leftIndex++;
            else if (!Character.isAlphabetic(alphabets[rightIndex]))
                rightIndex--;
            else {
                char temp = alphabets[rightIndex];
                alphabets[rightIndex] = alphabets[leftIndex];
                alphabets[leftIndex] = temp;
                leftIndex++;
                rightIndex--;
            }
        }
        System.out.println(String.valueOf(alphabets));
    }
}
