package park.sec2;

import java.util.Scanner;

public class INF0207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        for (int i = 0; i < n; i++) {
            str += sc.next();
        }

        INF0207 inf = new INF0207();
        System.out.println(inf.solution(str));
    }

    public int solution(String str) {
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '1') {
                cnt++;
                sum+=cnt;
            }else {
                cnt = 0;
            }
        }
        return sum;
    }
}
