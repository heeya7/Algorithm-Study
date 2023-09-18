package hyun;

import java.util.Scanner;

public class INF0104B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for(int i=0; i<num; i++){
            char[] word = scan.next().toCharArray();
            int leftIndex = 0;
            int rightIndex = word.length-1;
            while(leftIndex<rightIndex){
                char temp = word[rightIndex];
                word[rightIndex] = word[leftIndex];
                word[leftIndex] = temp;
                leftIndex++;
                rightIndex--;
            }
            for(char c : word)
                System.out.print(c);
            System.out.println();
        }
    }
}
