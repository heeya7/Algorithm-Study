package park.sec2;

import java.util.Scanner;

public class INF0212 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                grid[i][j] = sc.nextInt();
            }
        }

        INF0212 inf = new INF0212();
        System.out.print(inf.solution(n, m, grid));
    }

    public int solution(int n, int m, int[][] arr){
        int answer = 0;

        for(int i=1; i<=n; i++){            //1
            for(int j=1; j<=n; j++){        //2
                int cnt = 0;
                for(int k=0; k<m; k++){     //3
                    int pi = 0;
                    int pj = 0;

                    for(int s=0; s<n; s++){ //4
                        if(arr[k][s]==i) {  //5
                            pi=s;
                        }
                        if(arr[k][s]==j) {  //6
                            pj=s;
                        }
                    }
                    if(pi<pj) {             //7
                        cnt++;
                    }
                }

                if(cnt == m){               //8
                    answer++;
                    //System.out.println(i+" "+j);
                }
            }
        }

        return answer;
    }
}
