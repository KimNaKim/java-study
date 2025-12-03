package ex02;

public class Type01 {
    public static void main(String[] args) {
        //산술연산
        int a1 = 10;        //4바이트
        double a2 = 1.2;    //8바이트

        double sum1 = a1+a2;
        System.out.println(sum1);   //자동 형변환

        int sum2 = (int)a2;     //명시적 형변환(다운캐스팅)
        System.out.println(sum2);

        double sum3 = a1;       //묵시적 형변환(업캐스팅)
        System.out.println(sum3);

        byte a3 = (byte)300;    //문법적 오류는 없지만 출력값에 문제 발생(오버플로)
        System.out.println(a3);
    }
}
