package ex16;


interface RemoteAble{
    void power();
}

class threadQueue implements Runnable{
    @Override
    public void run(){
        
    }
}

public class Th02 {
    static void main(String[] args) {
        RemoteAble able = new RemoteAble() {    //익명 클래스
            @Override
            public void power() {
                
            }
        };      //해당 인터페이스를 상속받은 클래스를 new 한 것과 똑같음
        Thread t1 = new Thread();
        t1.start();
    }
}
