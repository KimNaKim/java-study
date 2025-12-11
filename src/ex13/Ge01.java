package ex13;


class Box {
    Object data;
}

public class Ge01 {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.data = "Hello, World!";
        String d1 = (String)b1.data;
        System.out.println(d1.length());
        System.out.println(b1.data.toString().length());
        //캐스팅이 번거로움 (제네릭을 쓰는 이유)
    }
}
