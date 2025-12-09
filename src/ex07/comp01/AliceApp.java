package ex07.comp01;

abstract class Judge{
    //구체적인 행위를 지정하지 못할 땐 상위 클래스 메서드 내부를 비워 둡니다.
    abstract public void judging();
    public void endJudging(){
        System.out.println("심문을 종료합니다.");
    }
}
abstract class Witness{
    abstract public void answer();
}
class King extends Judge{   //왕은 판사이다.
    @Override
    public void judging() {
        System.out.println("왕은 심문합니다.");
    }
}
class Queen extends Judge{  //여왕은 판사이다.

    @Override
    public void judging() {
        System.out.println("여왕은 심문합니다.");
    }
}
class MadHatter extends Witness{    //모자장수는 증인이다.

    @Override
    public void answer() {
        System.out.println("모자장수는 증언합니다.");
    }
}
class Alice extends Witness{    //앨리스는 증인이다

    @Override
    public void answer() {
        System.out.println("앨리스는 증언합니다.");
    }
}


public class AliceApp {
    static void main() {
        Judge king = new King();
        Judge queen = new Queen();
        Witness alice = new Alice();
        Witness madHatter = new MadHatter();
        king.judging();
        king.endJudging();
        queen.judging();
        queen.endJudging();
        alice.answer();
        madHatter.answer();

    }
}
