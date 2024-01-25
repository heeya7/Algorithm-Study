package park.sec2;

import java.util.Scanner;

public class INF0211 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n+1][6];

        for(int i=1; i<=n; i++){
            for(int j=1; j<=5; j++){
                grid[i][j] = sc.nextInt();
            }
        }

        INF0211 inf = new INF0211();
        System.out.print(inf.solution(n, grid));
    }

    public int solution(int n, int[][] grid){
        int answer=0, max=0;

        for(int i=1; i<=n; i++){
            int cnt = 0;

            for(int j=1; j<=n; j++){
                for(int k=1; k<=5; k++){
                    if(grid[i][k] == grid[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max){
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }
}
