package ex08.ch01;

//CheckedException, UnCheckedException
public class CheckTry {
    static void m1() throws Exception {
        throw new Exception("강제로 던진 CheckedException");
    }
    static void m2(){
        throw new RuntimeException("강제로 던진 UnCheckedException");
    }
    static void main() {
        try {
            m1();
            m2();
        } catch (Exception e) {
            System.out.println("오류발생");
            System.out.println(e.getMessage());
        }

    }
}
