package hyun;

import java.util.Scanner;

public class INF0106 {
    public static void main(String[] args) {
        int[] alphabet = new int[26];

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = "";
        
        for(char c : str.toCharArray()){
            if(alphabet[c-97] <= 0){
                alphabet[c-97]++;
                result += c;
            }
        }

        System.out.println("result = " + result);

        scan.close();
    }
}
