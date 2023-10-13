package hyun;

import java.util.Scanner;

public class INF0207 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int num = scan.nextInt();
        for(int i=0; i<num; i++){
            int score = scan.nextInt();
            if(score > 0){
                count++;
                sum += count;
                continue;
            }
            count = 0;
        }

        System.out.println(sum);

        scan.close();
    }
}
