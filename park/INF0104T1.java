package park;

import java.util.ArrayList;
import java.util.Scanner;

public class INF0104T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        INF0104T1 inf = new INF0104T1();
        for(String s : inf.solution(n, arr)) {
            System.out.println(s);
        }
    }

    public ArrayList<String> solution(int n, String[] arr) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : arr) {
            String temp = new StringBuilder(s).reverse().toString();
            answer.add(temp);
        }

        return answer;
    }
}
