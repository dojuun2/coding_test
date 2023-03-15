package 프로그래머스.lv1.문자열을_정수로_바꾸기;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.solution("-1234"));
    }

    public int solution(String s) {
//        int answer = 0;
//        answer = Integer.parseInt(s);
//        return answer;

        boolean Sign = true;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println("i = " + i +", ch = " + ch);
            if (ch == '-') {
                Sign = false;
            } else if (ch != '+') {
                result = result * 10 + (ch - '0');      // ex) 문자열 5에서 문자여 0을빼면 정수 5가 됨
            }
        }
        return Sign ? 1 : -1 * result;
    }
}
