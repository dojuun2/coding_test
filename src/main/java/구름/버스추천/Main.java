package 구름.버스추천;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nTime = br.readLine();    // 현재 시간

        // 현재 시간을 분으로 변환
        int nTimeToMin = Integer.parseInt(nTime.split(":")[0]) * 60
                + Integer.parseInt(nTime.split(":")[1]);

        String[] bTime = br.readLine().split(" ");   // 버스 도착 시간
        int[] bTimeToMinArray = new int[5];      // 버스 도착 시간을 분으로 변환하여 저장할 배열

        // 반복문 돌려서 분으로 변환한 시간 배열에 넣어주기
        for (int i = 0; i < bTime.length; i++) {
            bTimeToMinArray[i] = Integer.parseInt(bTime[i].split(":")[0]) * 60
                    + Integer.parseInt(bTime[i].split(":")[1]);
        }

        int result = 999999999;
        // 가장 가까운 버스시간 찾기
        for (int bTimeToMin : bTimeToMinArray) {
            if (bTimeToMin - nTimeToMin > 0 && bTimeToMin - nTimeToMin < result) {
                result = bTimeToMin - nTimeToMin;
            }
        }

        System.out.println(result);
    }
}
