package hyun;

import java.util.Scanner;

public class INF0208 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] scores = new int[n];
        String result = "";

        for(int i=0; i<n; i++)
            scores[i] = Integer.parseInt(scan.next());

        for(int i=0; i<n; i++){
            int count = 1;
            for(int j=0; j<n; j++){
                if(scores[j] > scores[i])
                    count++;
            }
            result += count + " ";
        }

        System.out.println(result);

        scan.close();
    }
}
