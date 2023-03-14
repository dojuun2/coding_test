package 프로그래머스.lv1.자연수_뒤집어_배열로_만들기;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(Arrays.toString(m.solution(12345)));
    }

    public int[] solution(long n) {
        int length = Long.toString(n).length();    // 입력받은 n의 자릿수 저장 => 5자리
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            answer[i] = (int) (n % 10);     // long을 int로 형 변환
            n /= 10;
        }

        return answer;
    }
}
