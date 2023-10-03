package park;

import java.util.Scanner;

public class INF0108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toUpperCase().replaceAll("[^A-Z]"," ");
        s = s.replace(" ","");

        INF0108 inf = new INF0108();
        System.out.println(inf.solution(s));
    }

    public String solution(String s) {
        String answer = "YES";
        char[] arr = s.toCharArray();

        int lt = 0, rt = s.length() - 1;
        while(lt < rt) {
            if(arr[lt] != arr[rt]){
                answer = "NO";
                break;
            }
            lt++;
            rt--;
        }

        return answer;
    }
}
