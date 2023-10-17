package park.sec2;

import java.util.Scanner;

public class INF0208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }

        INF0208 inf = new INF0208();
        int[] rank = inf.solution(score);
        for (int i : rank) {
            System.out.print(i + " ");
        }
    }

    public int[] solution(int[] score) {
        int[] rank = new int[score.length];

        int cnt = 0;
        for (int i = 0; i < score.length; i++) {
            cnt = 1;
            for (int j = 0; j < score.length; j++) {
                if(score[i] < score[j]) {
                    cnt++;
                }
            }
            rank[i] = cnt;
        }
        return rank;
    }
}
