package ex03;

import java.util.Scanner;

public class GetSum {
    public static void main(String[] args) {
        //-1을 입력받을 때까지 입력받은 정수들의 총합을 구하는 코드
        Scanner sc = new Scanner(System.in);
        int sum = 0, value = 0;

        while(value != -1){
            sum += value;
            System.out.print("정수를 입력하세요 : ");
            value = sc.nextInt();
        }
        System.out.println("정수의 합은 " + sum + "입니다.");
    }
}
