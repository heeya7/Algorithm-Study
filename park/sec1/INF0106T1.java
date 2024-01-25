package park.sec1;

import java.util.Scanner;

public class INF0106T1 {
    public String solution(String str){
        String answer = "";

        for(int i=0; i<str.length(); i++){
            //indexOf()했을 때 값이 위치하는 첫번째 index값을 갖고 오므로
            //str.indexOf(str.charAt(i)) = i보다 앞에 값이 나온다면 중복된 값
            if(str.indexOf(str.charAt(i))==i) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args){
        INF0106T1 inf = new INF0106T1();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(inf.solution(str));
    }
}
