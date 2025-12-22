package ex16;

public class Anony01 {
    static void main() {
        RemoteControl ac = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("TV를 켰습니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("TV를 껐습니다.");
            }
        };
        ac.turnOn();
        ac.turnOff();

    }
}
