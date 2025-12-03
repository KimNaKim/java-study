package ex03;

import java.util.Scanner;

public class GetCoin {
    public static void main(String[] args) {
        //입력받은 금액을 동전들로 환전하기
        int money;
        int[] amount = {500, 100, 50, 10};
        Scanner sc = new Scanner(System.in);

        System.out.print("금액을 입력해주세요. : ");
        money = sc.nextInt();

        for (int i = 0; i<=3; i++){
            System.out.println(amount[i] + "원 동전의 개수 : " + money/amount[i]);
            money %= amount[i];
        }
        if(money < 10) System.out.println("남은 잔액 : " + money + "원");
    }
}
