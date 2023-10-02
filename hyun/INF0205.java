package hyun;

import java.util.Scanner;

public class INF0205 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int[] nums = new int[num+1];
        int count = 0;

        for(int i=2; i<=num; i++){
            if(nums[i] == 0){
                for(int j=i; j<=num; j+=i)
                    nums[j] = 1;
                count++;
            }
        }

        System.out.println(count);

        scan.close();
    }
}

