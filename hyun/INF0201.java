package hyun;

import java.util.Scanner;

public class INF0201 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int prevNum = -1;

        for(int i=0; i<num; i++){
            int currentNum = scan.nextInt();
            if(prevNum < currentNum)
                System.out.print(currentNum+" ");
            prevNum = currentNum;
        }

        scan.close();
    }
}
