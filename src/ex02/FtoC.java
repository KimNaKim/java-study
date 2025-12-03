package ex02;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("1.화씨->섭씨");
        System.out.println("2.섭씨->화씨");
        System.out.println("============================");
        System.out.println();
        System.out.print("번호를 선택해주세요. : ");
        int mode = sc.nextInt();

        //조건연산자로 작성 - 번호 입력받기
        System.out.print((mode == 1)? "화씨 온도를 입력해주세요. : " :
                ((mode == 2)? "섭씨 온도를 입력해주세요 : " : "1과 2 외의 숫자는 입력이 불가합니다."));
        //아직 배우지 않은 부분이지만 작동이 조금 깔끔했으면 해서 추가한 코드입니다
        if ((mode!=1) && (mode!=2)) return;
        double temperture = sc.nextDouble();
        System.out.println((mode == 1)? "섭씨 온도는 " + (temperture-32)/9*5 + "입니다." :
                "화씨 온도는 " + (temperture+32)/5*9 + "입니다.");

        //if-else문으로 작성
       /* if (mode == 1){
            System.out.print("화씨 온도를 입력해주세요. : ");
            double fToC = sc.nextDouble();
            System.out.println("섭씨 온도는 " + (fToC-32)/9*5 + "입니다.");
        } else if (mode == 2){
            System.out.print("섭씨 온도를 입력해주세요. : ");
            double cToF = sc.nextDouble();
            System.out.println("화씨 온도는 " + (cToF+32)/5*9 + "입니다.");
        } else {
            System.out.println("1과 2 외의 숫자는 입력이 불가합니다.");
        }*/
    }
}
