package chapter03;

import java.util.Scanner;

public class INF0303 {
    public static int solution(int n, int k, int[] arr) {
        int answer = 0, sum = 0;
        for(int i=0; i<k; i++) sum+=arr[i];
        answer = sum;

        int p1 = 0, p2 = k;
        while(p2<n) {
            sum = sum - arr[p1++] + arr[p2++];

            if(answer < sum) {
                answer = sum;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(solution(n,k,arr));

    }
}
