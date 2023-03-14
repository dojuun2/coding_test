package 구름.케이크;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);     // 조각의 갯수
        int k = Integer.parseInt(input[1]);
        ArrayList<Integer> arrayList = new ArrayList<>();   // 케익을 담을 리스트

        for (int i = 0; i < n; i++) {
            arrayList.add(i + 1);
        }
//        System.out.println("케익은 "+arrayList);

        int i = 0;
        while (true) {
            if (i >= arrayList.size()) i = 0;
            if (arrayList.size() == 2) break;
//            System.out.println(i + 1 + "번째 케익");
            arrayList.remove(i);
//            System.out.println(arrayList);
            i += k - 1;
        }

        br.close();
        System.out.println(arrayList.get(0) + " " + arrayList.get(1));
    }
}
