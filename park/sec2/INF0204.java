package park.sec2;

import java.util.Scanner;

public class INF0204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        INF0204 inf = new INF0204();
        for (int i : inf.solution(n)) {
            System.out.printf(i + " ");
        }
    }

    public int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
//        answer[1] = 1; 애초에 1, 1 미리 넣어도됨

        for (int i = 1; i < n; i++) {
            if(i == 1) {
                answer[i] = 0 + i;
            }else {
                answer[i] = answer[i-2] + answer[i-1] ;
            }
        }

        return answer;
    }
}
