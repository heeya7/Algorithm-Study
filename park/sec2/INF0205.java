package park.sec2;

import java.util.Scanner;

public class INF0205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        INF0205 inf = new INF0205();
        System.out.println(inf.solution(n));
    }

    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n+1];

        for (int i=2; i<=n; i++) {
            if(ch[i] == 0) {
                answer++;
                for (int j=i; j<=n; j=j+i) {
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }
}
