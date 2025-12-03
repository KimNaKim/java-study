package ex01;

public class Var01 {
    public static void main(String[] args) {
        //1byte의 공간을 할당하고 해당 공간에 a1라는 식별자를 붙인 뒤 100을 저장해라.
        byte a1 = 100;
        //4byte의 공간을 할당하고 해당 공간에 a2라는 식별자를 붙인 뒤 2000000000을 저장해라.
        int a2 = 2000000000;
        //8byte의 공간을 할당하고 해당 공간에 a3라는 식별자를 붙인 뒤 1.5를 저장해라.
        double a3 = 1.5;
        //1byte의 공간을 할당하고 해당 공간에 a4라는 식별자를 붙인 뒤 true를 저장해라.
        boolean a4 = true;
        //해당 변수들을 출력해라.
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println("a3 = " + a3);
        System.out.println("a4 = " + a4);
    }
}
