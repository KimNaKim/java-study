package ex06.ch02;



//메서드의 상속
class Car {
    void run(){}
}
class Sonata extends Car{
    //부모 클래스에 존재하는 메서드를 재정의
    //부모의 run()이 작동하지만, 부모의 run() 내부 코드가 작동하지 않음(무시하고 대신함)
    //부모의 메서드를 무효화시킴
    void run(){
        System.out.println("소나타가 달립니다.");
    }
}
class Morning extends Car{
    void run(){
        System.out.println("모닝이 달립니다.");
    }
}


public class ExMeh01 {
    public static void main(String[] args) {
        Morning c1 = new Morning();
        c1.run();
        Car c2 = new Sonata();
        c2.run();
        Car c3 = new Morning();
        c3.run();


    }
}
