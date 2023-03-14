package 프로그래머스.lv1.x만큼_간격이_있는_n개의_숫자;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();

        // 2	    5	    [2,4,6,8,10]
        // 4	    3	    [4,8,12]
        // -4	    2	    [-4, -8]
        System.out.println(m.solution(-4, 2));
    }

    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        long k = x;
        for (int i = 0; i < n; i++) {
            answer[i] = x;
            x += k;
        }
        return answer;
    }
}
