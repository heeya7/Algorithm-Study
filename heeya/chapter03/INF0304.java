package chapter03;

import java.util.Scanner;

public class INF0304 {
    public static int solution(int n, int m, int[] arr) {
        int answer = 0, lt = 0, sum = 0;
        for(int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            while(sum > m) {
                sum -= arr[lt];
                lt++;
            }
            if(sum == m) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(solution(n,m,arr));

    }
}
