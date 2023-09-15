import java.util.ArrayList;
import java.util.Scanner;

public class INF0301 {

    public static ArrayList<Integer> solution(int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while(p1 < arr1.length && p2 < arr2.length) {
            if(arr1[p1] < arr2[p2]) {
                answer.add(arr1[p1]);
                p1++;
            } else if(arr1[p1] > arr2[p2]) {
                answer.add(arr2[p2]);
                p2++;
            } else if(arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1]);
                answer.add(arr2[p2]);
                p1++;
                p2++;
            }
        }

        // arr1 배열의 값이 남았을 때
        if(p1 != arr1.length) {
            for(; p1<arr1.length; p1++) {
                answer.add(arr1[p1]);
            }
        // arr2 배열의 값이 남았을 때
        } else if(p2 != arr2.length) {
            for(; p2<arr2.length; p2++) {
                answer.add(arr2[p2]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n1 = kb.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0; i<n1; i++) {
            arr1[i] = kb.nextInt();
        }

        int n2 = kb.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0; i<n2; i++) {
            arr2[i] = kb.nextInt();
        }

        for(int x : solution(arr1, arr2)) {
            System.out.print(x+" ");
        }

    }
}
