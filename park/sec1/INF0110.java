package park.sec1;

import java.util.Scanner;

public class INF0110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);

        INF0110 inf = new INF0110();
        for (int i : inf.solution(s, c)) {
            System.out.printf(i + " ");
        }
    }

    public int[] solution(String s, char target) {
        int[] answer = new int[s.length()];
        int distance = 1000;

        //앞에서부터 검사
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == target) {
                distance = 0;
                answer[i] = 0;
            }else {
                distance++;
                answer[i] = distance;
            }
        }

        distance = 1000;

        //뒤에서부터 검사
        for (int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) == target) {
                distance = 0;
                //answer[i] = 0; 어차피 0이 들어있으니 다시 안 넣어줘도됨
            }else {
                distance++;
                answer[i] = Math.min(answer[i], distance);
            }
        }

        return answer;
    }
}
