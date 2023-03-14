package 프로그래머스.lv1.문자열_내_p와_y의_개수;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.solution("Pyy"	));
    }

    boolean solution(String s) {
        boolean answer = true;
        String[] sArr = s.split("");
        System.out.println(Arrays.toString(sArr));
        int pCnt = 0;
        int yCnt = 0;

        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i].equals("p") || sArr[i].equals("P")) {
                pCnt++;
            } else if (sArr[i].equals("y") || sArr[i].equals("Y")){
                yCnt++;
            }
        }

        if (pCnt == yCnt) {
            answer =true;
        } else {
            answer = false;
        }
        return answer;
    }
}
