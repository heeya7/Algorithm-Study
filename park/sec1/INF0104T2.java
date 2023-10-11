package park.sec1;

import java.util.ArrayList;
import java.util.Scanner;

public class INF0104T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        INF0104T2 inf = new INF0104T2();
        for(String s : inf.solution(n, arr)) {
            System.out.println(s);
        }
    }

    public ArrayList<String> solution(int n, String[] arr) {
        ArrayList<String> answer = new ArrayList<>();
        //직접 뒤집기
        for (String s : arr) {
            char[] cArr = s.toCharArray();
            int left = 0, right = s.length() - 1;
            while(left < right) {
                char charTemp = cArr[left];
                cArr[left] = cArr[right];
                cArr[right] = charTemp;
                left ++;
                right --;
            }
            String temp = String.valueOf(cArr);
            answer.add(temp);
        }

        return answer;
    }
}
