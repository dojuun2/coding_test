package 구름.카드관리;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // ArrayList를 이용한 카드 결제 시스템
        ArrayList<Integer> array = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 계좌에 있는 돈
        int m = sc.nextInt();   // 거래 횟수

        String type;    // 거래 종류
        int k;      // 결제금액

        for (int i = 0; i < m; i++) {
            type = sc.next();
            k = sc.nextInt();
            System.out.println("계좌 잔액은 " + n);
            System.out.println("결제 종류는 " + type);
            System.out.println("결제 금액은 " + k);

            if (type.equals("deposit")) {
                System.out.println("deposit 수행");
                n += k;     // 돈 입금
                System.out.println("입금 후 계과 잔액은 " + n);
            }
            if (n < k) {       // 결제금액보다 돈이 모자른 상황
                if (type.equals("reservation")) {
                    array.add(k);
                    System.out.println(k + " 대기목록 추가");
                } else if (type.equals("pay")) {
                    System.out.println(k + "결제 실패");
                }
            } else {    // 결제 가능한 금액이 있는 상황
                if (type.equals("reservation")) {
                    if (array.size() == 0) {
                        System.out.println("결제");
                        n -= k;
                        System.out.println("결제 후 잔액은 " + n);
                    } else {    // 대기목록이 있으면
                        System.out.println("결제 실패");
                        array.add(k);
                        System.out.println(k + " 대기목록 추가");
                    }
                } else if (type.equals("pay")) {
                    System.out.println("결제");
                    n -= k;
                    System.out.println("결제 후 잔액은 " + n);
                }
            }
            System.out.println(array);
        }

        // 잔액이 대기목록에 있는 금액을 결제 못할때까지
        while (true) {
            // 대기목록이 있고
            if (array.size() > 0) {
                if (n >= array.get(0)) { // 잔액이 대기목록의 첫 금액보다 많으면
                    System.out.println("대기목록 첫번째 금액만큼 결제");
                    n -= array.get(0);      // 대기목록의 첫번째 금액만큼 결제되고
                    System.out.println("결제 후 남은 금액은 " + n);
                    array.remove(0);    // 대기목록에서 빠진다
                } else {
                    break;
                }
            } else {
                break;
            }
        }

        sc.close();
        System.out.println(n);      // 잔액 출력

    }
}
