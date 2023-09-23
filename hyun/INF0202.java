package hyun;

import java.util.Scanner;

public class INF0202 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int count = 0;
        int maxHeight = 0;

        for(int i=0; i<num; i++){
            int height = scan.nextInt();
            if(height > maxHeight){
                count++;
                maxHeight = height;
            }
        }

        System.out.println(count);

        scan.close();
    }
}
