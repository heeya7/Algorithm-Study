package park.sec2;

import java.util.Scanner;

public class INF0202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        INF0202 inf = new INF0202();
        System.out.println(inf.solution(nums));

    }

    public int solution(int[] nums) {
        int cnt = 1;
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > max) {
                cnt++;
                max = nums[i];
            }
        }
        return cnt;
    }
}
