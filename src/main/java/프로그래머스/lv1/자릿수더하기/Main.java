package 프로그래머스.lv1.자릿수더하기;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();

        // 123 => 6
        // 987 => 24
        System.out.println(m.solution(123));
    }

    public int solution (int n) {
        int answer = 0;

        while(n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}
