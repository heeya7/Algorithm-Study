package hyun;

import java.util.Scanner;

public class INF0206A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();

        for(int i=0; i<size; i++){
            int num = scan.nextInt();
            int temp = num;
            num = 0;

            // 숫자 뒤집기
            while (temp > 0){
                int t = temp % 10;
                num = (num * 10) + t;
                temp = temp / 10;
            }

            // 소수 확인
            for(int j=2; j<=num; j++){
                if(num % j == 0){
                    if(j < num) break;
                    System.out.printf("%d ", j);
                }
            }
        }

        scan.close();
    }
}
