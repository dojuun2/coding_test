package 프로그래머스.lv1.평균구하기;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();

        // [1,2,3,4] => 2.5
        // [5, 5] => 5
        int[] arr = {1, 2, 3, 4};
        System.out.println(m.solution(arr));
    }

    public double solution(int[] arr) {
        double answer = 0;
        for (int item : arr) {
            answer += item;
        }
        answer /= arr.length;
        return answer;
    }
}
