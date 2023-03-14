package 프로그래머스.lv1.나머지가_1이_되는_수_찾기;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.solution(12));
    }

    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i < n ; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
