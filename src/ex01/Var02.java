package ex01;

public class Var02 {
    public static void main(String[] args) {
        //문자열은 변수에서 공간 할당을 미리 해두는 것이 불가능하다.
        //heap 영역에 입력값을 저장하고, 해당 주소(포인터)를 변수에 저장한다. (CallByReference)
        String a1 = "Hello, ";
        String a2 = "World!";
        //해당 변수들의 값을 출력한다.
        System.out.println(a1 + a2);
        //해당 값이 저장된 실제 메모리 주소(포인터)를 출력한다.
        System.out.println("a1의 주소: " + System.identityHashCode(a1));
        System.out.println("a2의 주소: " + System.identityHashCode(a2));
    }
}
