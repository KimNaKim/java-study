package ex16;

interface remoteAble{
    void power();
}

class ThreadQueue implements Runnable{
    @Override
    public void run(){
        System.out.println("큐를전달받기");
    }
}

public class Lamb01 {

    static void main(String[] args) {
        Thread t1 = new Thread(new ThreadQueue());  //정석 큐 할당
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("큐를전달받기");
            }
        });     //runnable 익명 클래스
        t2.start();
        Thread t3 = new Thread(() -> {});   //람다식을 이용한 스레드의 큐 할당
        t3.start();                         //인터페이스의 메서드가 1개 이상일 경우 쓸 수 없음

    }
}
