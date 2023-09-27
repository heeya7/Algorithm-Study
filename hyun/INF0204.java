package hyun;

import java.util.Scanner;

public class INF0204 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int n1 = 0;
        int n2 = 1;

        System.out.print(n2 + " ");
        for(int i=0; i<num-1; i++){
            int sum = n1+n2;
            System.out.print(sum+" ");
            n1 = n2;
            n2 = sum;
        }

        scan.close();
    }
}
