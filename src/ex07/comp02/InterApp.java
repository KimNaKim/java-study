package ex07.comp02;

//'can do'
interface remoteAble {
    public abstract void power();
}

abstract class RemoteCon implements remoteAble{
    private boolean power;
    public void power(){        //트리거로 동작
        this.power = !this.power;
    }
    public RemoteCon(){
        this.power = false;
    }
    public boolean isPower() {
        return power;
    }
}

class SamSungR extends RemoteCon{
    public SamSungR(){
        //상위 클래스의 생성자를 호출하는 코드
        //super()는 굳이 적지 않아도 호출됨
    }
}

class LGR extends RemoteCon{
    public LGR(){
        super();
    }
}

public class InterApp {
    static void main() {
        SamSungR sSR = new SamSungR();
        LGR lGR = new LGR();


        sSR.power();
        System.out.println(sSR.isPower());
        sSR.power();
        System.out.println(sSR.isPower());
    }
}
