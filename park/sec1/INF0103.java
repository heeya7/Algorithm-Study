package park.sec1;

import java.util.Scanner;

public class INF0103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        INF0103 inf = new INF0103();
        System.out.println(inf.solution(s));
    }

    public String solution(String s) {
        String[] strings = s.split(" ");

        String maxStr = "";
        for(String str :  strings) {
            if(str.length() > maxStr.length()) {
                maxStr = str;
            }
        }
        return maxStr;
    }
}
