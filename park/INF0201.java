package park;

import java.util.ArrayList;
import java.util.Scanner;

public class INF0201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        INF0201 inf = new INF0201();

        ArrayList<Integer> answerList = inf.solution(nums);

        for (int i : answerList) {
            System.out.print(i + " ");
        }
    }

    public ArrayList<Integer> solution(int[] nums) {
        ArrayList<Integer> answerList = new ArrayList<>();
        answerList.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i-1]) {
                answerList.add(nums[i]);
            }
        }

        return answerList;
    }
}
