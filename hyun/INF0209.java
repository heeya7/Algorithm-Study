package hyun;

import java.util.Scanner;

public class INF0209 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] board = new int[n][n];
        int result = 0;


        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                board[i][j] = scan.nextInt();

        int ltSum = 0, rtSum = 0;
        for (int i = 0; i < n; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += board[i][j];
                colSum += board[j][i];
            }
            result = Math.max(result, Math.max(rowSum, colSum));

            ltSum += board[i][i];
            rtSum += board[i][n - 1 - i];
        }

        result = Math.max(result, Math.max(ltSum, rtSum));

        System.out.println("result = " + result);

        scan.close();
    }
}
