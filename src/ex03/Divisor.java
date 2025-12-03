package ex03;

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        //양의 정수를 입력받아 그 정수의 모든 약수를 출력하는 코드
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요 : ");
        int n = sc.nextInt();

        for(int i = 1; i<= n; i++){
            if (n%i == 0){
                System.out.print(" " + i);
            }
        }
    }
}
