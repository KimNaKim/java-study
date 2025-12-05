package ex06.ch01;

//추상적 클래스(직접적인 객체는 생성하지 않고 분류 기준으로만 동작하는 클래스)
class Sinner{ }
class Judge{ }
class Host{ }

//구체적 클래스(new를 이용해 객체를 직접 생성해야 하는 클래스)
class King extends Judge { }
class Queen extends Judge { }
class Rabbit extends Host { }
class MadHatter extends Sinner { }

public class Ex01 {
    public static void main(String[] args) {
        //상속의 정의
        Sinner u1 = new MadHatter();
        Rabbit u2 = new Rabbit();
        Judge u3 = new King();
        Judge u4 = new Queen();
    }
}
