package 프로그래머스.lv1.두_정수_사이의_합;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.solution(5, 3));

    }

    public long solution(int a, int b) {
        long answer = 0;

        if (a <= b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }

        return answer;
    }
}
