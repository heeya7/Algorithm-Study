package hyun;

import java.util.Scanner;

public class INF0206 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        
        for(int i=0; i<size; i++){
            // 숫자 뒤집기
            StringBuilder temp = new StringBuilder(scan.next()).reverse();
            int num = Integer.parseInt(temp.toString());

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
