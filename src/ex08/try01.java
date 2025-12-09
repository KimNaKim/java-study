package ex08;

public class try01 {
    
    static void start(){
        //임의로 예외 발생시키기
        //JVM에 예외 송신 -> 예외 처리가 없으면 실행이 멈춤
        //발생한 예외는 반드시 자신을 호출한 객체로 돌아감
        throw new RuntimeException("임의로 발생시킨 예외");
    }
    static void main() {
        try{    //try-catch문
            start();
        } catch (Exception e) {
            System.out.println("오류가 발생했습니다.");
            System.out.println("오류 : " + e.getMessage());
        }
    }
}
