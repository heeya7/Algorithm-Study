package hyun;

import java.util.Scanner;

public class INF0112 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.next());
        String code = scan.next();

        for(int i=0; i<num; i++){
            String decode = code.substring(0, 7).replace("#", "1").replace("*", "0");
            double result = 0;
            for(int j=0; j<decode.length(); j++)
                if(decode.charAt(decode.length()-(j+1)) == '1')
                    result += Math.pow(2, j);
//            System.out.print((char)Integer.parseInt(decode,2));
            System.out.print((char) result);
            code = code.substring(7);
        }

        scan.close();
    }
}
