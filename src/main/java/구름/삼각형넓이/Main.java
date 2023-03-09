package 구름.삼각형넓이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 삼각형의 밑변과 높이가 주어졌을 때, 삼각형의 넓이를 구해라
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] num = str.split(" ");

        int n1 = Integer.parseInt(num[0]); // 밑변
        int n2 = Integer.parseInt(num[1]); // 높이

        double result = n1 * n2 * 1/2;
        System.out.println(Math.round(33.334444 * 10) / 10.0);
    }
}
