package park.sec2;

import java.util.Scanner;

public class INF0209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] grid = new int[n][n];

//        for (int i = 0; i < n; i++) {
//            String s = sc.nextLine();
//            String[] split = s.split(" ");
//
//            for (int j = 0; j < n; j++) {
//                grid[i][j] = Integer.parseInt(split[j]);
//            }
//        }

        //바로 2차배열로 저장
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                grid[i][j]=sc.nextInt();
            }
        }

        INF0209 inf = new INF0209();
        System.out.println(inf.solution(grid, n));
    }

    public int solution(int[][] grid, int n) {
        int max = 0;

        // 열의합 = 00 01 02 03 04
        // 행의합 = 00 10 20 30 40
        // 주대각선의 합 = 00 11 22 33 44
        // 반대각선의 합 = 04 13 22 31 40
        for (int i = 0; i < n; i++) {
            int[] sums = new int[4];

            for (int j = 0; j < n; j++) {
                sums[0] += grid[i][j];
                sums[1] += grid[j][i];
                sums[2] += grid[j][j];
                sums[3] += grid[j][n-j-1];
            }

            //최댓값 구하기
            for (int sum : sums) {
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
