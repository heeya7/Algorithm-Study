package hyun;

import java.util.Scanner;

public class INF0210 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] map = new int[n][n];

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for(int k=0; k<4; k++){
                    int x = i + dx[k];
                    int y = j + dy[k];
                    if(x >= 0 && x < n && y >= 0 && y < n && map[x][y] >= map[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag) count++;
            }
        }

        System.out.println(count);

        scan.close();
    }
}
