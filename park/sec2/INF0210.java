package park.sec2;

import java.util.Scanner;

public class INF0210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n+2][n+2];

        //0 채우기
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                grid[0][j] = 0;
                grid[n-1][j] = 0;
                grid[i][0] = 0;
                grid[i][n-1] = 0;
            }
        }

        //중앙에 값 입력받기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i+1][j+1] = sc.nextInt();
            }
        }

        INF0210 inf = new INF0210();
        System.out.println(inf.solution(n, grid));
    }

    public int solution(int n, int[][] grid) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(grid[i][j] > grid[i-1][j] && grid[i][j] > grid[i+1][j] && grid[i][j] > grid[i][j-1] && grid[i][j] > grid[i][j+1]) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
