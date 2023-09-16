package hyun;

import java.util.Scanner;

public class INF0107 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        char[] alphabet = str.toLowerCase().toCharArray();

        int leftIndex = 0;
        int rightIndex = alphabet.length - 1;
        Boolean result = true;

        while(leftIndex<rightIndex && result){
            if(alphabet[leftIndex] != alphabet[rightIndex])
                result = false;
            leftIndex++;
            rightIndex--;
        }

        System.out.println(result ? "YES" : "NO");

        scan.close();
    }
}
