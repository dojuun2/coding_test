package 프로그래머스.lv1.정수_제곱근_판별;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.solution(9));
    }

    public long solution(long n) {
        long answer = 0;

        while(answer * answer <= n){
            if (++answer*answer == n) return (answer+1)*(answer+1);
        }

        return -1;
    }
}
