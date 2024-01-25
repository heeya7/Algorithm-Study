package hyun;

import java.util.Scanner;

public class INF0203 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        String a = scan.nextLine().replace(" ", "");
        String b = scan.nextLine().replace(" ", "");

        // 1 : 가위, 2 : 바위, 3 : 보
        for(int i=0; i<num; i++){
            if(a.charAt(i) == b.charAt(i)){
                System.out.println("D");
                continue;
            }
            switch (a.charAt(i)){
                case '1' :
                    System.out.println(b.charAt(i) == '2' ? "B" : "A");
                    break;
                case '2' :
                    System.out.println(b.charAt(i) == '3' ? "B" : "A");
                    break;
                case '3' :
                    System.out.println(b.charAt(i) == '1' ? "B" : "A");
                    break;
            }
        }

        scan.close();
    }

}

