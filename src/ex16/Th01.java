package ex16;


class Hello implements Runnable{    //Thread에서는 Runnable 인터페이스를 사용함(행위제한)
    //서브스레드
    @Override
    public void run(){     //스레드에서는 run() 함수를 먼저 찾아 실행하도록 정해져 있음
        for(int i = 0; i<100; i++){
            System.out.println(i + "번째 서브스레드 실행");
        }
        System.out.println("서브스레드 종료");
    }
}

public class Th01 {
    //메인 스레드
    static void main(String[] args) {
        System.out.println("첫 번째 실행");
        System.out.println("두 번째 실행");
        System.out.println("세 번째 실행");
        Hello hello = new Hello();
        Thread sub = new Thread(hello);
        sub.start();    //run 메서드가 새로운 작업 단위가 됨
        for(int i = 0; i<100; i++){
            System.out.println(i + "번째 메인스레드 실행");
        }
        System.out.println("메인스레드 종료");
    }
}
