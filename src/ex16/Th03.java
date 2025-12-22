package ex16;

public class Th03 {
    static void main() {
        Thread t1 = new Thread(()->{
            for(int i = 0; i<200; i++){
                System.out.println("서브스레드 실행");
            }
        });
        t1.start();
        Thread t2 = new Thread(()->{
            for(int i = 0; i<200; i++){
                System.out.println("메인스레드 실행");
            }
        });
        t2.start();
    }
}
