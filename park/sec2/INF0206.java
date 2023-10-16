package park.sec2;

import java.util.ArrayList;
import java.util.Scanner;

public class INF0206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        INF0206 inf = new INF0206();
        ArrayList<Integer> answerList = inf.solution(arr);
        for (int answer : answerList) {
            System.out.print(answer + " ");

        }
    }

    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answerList = new ArrayList<>();

        for (int i : arr) {
            int res = Integer.parseInt(new StringBuilder(String.valueOf(i)).reverse().toString());
            if(isPrime(res)) {
                answerList.add(res);
            }
        }

        /* 직접 뒤집기 */
//        for(int i=0; i<n; i++){
//            int tmp=arr[i];
//            int res=0;
//            while(tmp>0){
//                int t=tmp%10;
//                res=res*10+t;
//                tmp=tmp/10;
//            }
//            if(isPrime(res)) answer.add(res);
//        }

        return answerList;
    }

    private boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
