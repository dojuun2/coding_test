package 프로그래머스.lv1.짝수와홀수;

public class Main {
    // 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환
    public String solution(int num) {
        String answer = "";
        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
    }

    public static void main(String[] args) {
        int num = 4;
        Main m = new Main();
        String result = m.solution(num);
        System.out.println(result);

    }
}
