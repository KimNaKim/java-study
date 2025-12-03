package ex04;

//OOP : Object Oriented Programming 객체 지향 프로그래밍
//1원칙 : 상태는 행위를 통해 변경해야만 한다.
public class PeopleApp {
    public static void main(String[] args) {
        People p1 = new People("김나경",153, 70);
        People p2 = new People("홍길동",180,85);

        p1.eat();
        System.out.println(p1.getWeight());
    }
}
