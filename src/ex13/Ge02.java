package ex13;


class Box2<T>{
    private T data;

    public T getData(){ return data;}
    public void SetData(T data) { this.data = data;}
}
public class Ge02 {
    public static void main(String[] args) {
        Box2<String> box2 = new Box2();
        box2.SetData("Hello, World!");
        System.out.println(box2.getData().length());

    }
}
