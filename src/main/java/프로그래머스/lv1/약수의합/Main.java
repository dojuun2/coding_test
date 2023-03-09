package 프로그래머스.lv1.약수의합;

public class Main {
    // 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴

    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n1 = 12;
        int n2 =5;
        Main main = new Main();
        int result = main.solution(n1);
        System.out.println(result);

    }

}
