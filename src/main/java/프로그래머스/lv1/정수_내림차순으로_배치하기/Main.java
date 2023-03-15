package 프로그래머스.lv1.정수_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.solution(118372));
    }

    public long solution(long n) {
        String answer = "";
        String str = Long.toString(n);

        int[] arr = new int[str.length()];

        // long타입의 숫자를 Integer배열로 옮긴다.
        for (int i = 0; i < str.length(); i++) {
            String s = str.substring(i, i + 1);     // i번째 문자만 추출
            arr[i] = Integer.parseInt(s);   // 추출한 i번째 문자를 형변환하여 배열에 삽입
        }

        System.out.println(Arrays.toString(arr));

        // 내림차순 정렬
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = 0; j < str.length() - 1; j++) {
                System.out.println("i = " + i + ", j = " + j);
                System.out.println(Arrays.toString(arr));
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for (int i = 0; i < str.length(); i++) {
            answer += arr[i];
        }

        // 다른풀이
//        String[] list = String.valueOf(n).split("");
//        Arrays.sort(list);
//
//        StringBuilder sb = new StringBuilder();
//        for (String aList : list) sb.append(aList);
//
//        return Long.parseLong(sb.reverse().toString());

        return Long.parseLong(answer);
    }
}
