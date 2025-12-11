package ex13;

class Box3{

    Object data;

    //main 시작 전에 실행됨
    public static Box3 instance = new Box3();

    private Box3(){

    }
}

public class Ge03 {
    public static void main(String[] args) {
        //new가 아니라, 이미 있는 객체를 끌어옴
        Box3 box3 = Box3.instance;
        box3.data = "Hello";

        //제네릭을 사용하지 않았기에 다운캐스팅 필요
        String castData = (String)box3.data;
        System.out.println(castData.length());
    }
}
