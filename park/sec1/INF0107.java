package park.sec1;

import java.util.Scanner;

public class INF0107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toUpperCase();

        INF0107 inf = new INF0107();
        System.out.println(inf.solution(s));
    }

    public String solution(String s) {
        String answer = "YES";
        int lt = 0, rt = s.length() - 1;
        char[] arr = s.toCharArray();

        while(lt < rt) {
            if(arr[lt] == arr[rt]) {
                lt++;
                rt--;
            }else {
                answer = "NO";
                break;
            }
        }
        return answer;
    }
}
