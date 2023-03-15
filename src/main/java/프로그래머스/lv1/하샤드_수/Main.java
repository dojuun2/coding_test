package 프로그래머스.lv1.하샤드_수;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.solution(10));

    }

    public boolean solution(int x) {
        boolean answer = true;
        int k = x;
        int sum = 0;

        while (k > 0) {
            sum = sum + k % 10;
            k /= 10;
        }

        if (x % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}
