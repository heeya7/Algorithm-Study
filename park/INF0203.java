package park;

import java.util.Scanner;

public class INF0203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(sc.next());
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = Integer.parseInt(sc.next());
        }

        INF0203 inf = new INF0203();
        for (char c : inf.solution(arr1, arr2).toCharArray()) {
            System.out.println(c);
        }
    }

    public String solution(int[] a, int[] b) {
        String answer = "";
        for (int i=0; i<a.length;i ++) {
            if(a[i] == b[i]) {
                answer += "D";
            } else if(a[i] == 1 && b[i] == 3) {
                answer += "A";
            }else if(a[i] == 2 && b[i] == 1) {
                answer += "A";
            }else if(a[i] == 3 && b[i] == 2) {
                answer += "A";
            }else {
                answer += "B";
            }
        }

        return answer;
    }
}
