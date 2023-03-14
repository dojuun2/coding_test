package 구름.물탱크;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> sList = new ArrayList<>();

        String input = "";
        for (int i = 0; i < n - 1; i++) {
            input = br.readLine();
            sList.add(Integer.parseInt(input.split(" ")[0]));
        }

        int[] modeArray = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            modeArray[sList.get(i)]++;
        }

        int modeNum = 0; // 최빈수
        int modeCnt = 0; // 최빈수가 출현한 횟수
        for (int i = 0; i < n - 1; i++) {
            if (modeCnt < modeArray[i]) {
                modeCnt = modeArray[i];
                modeNum = i;
            }
        }

        // 결과 출력
        System.out.println(modeNum);
    }
}
