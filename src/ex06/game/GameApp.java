package ex06.game;

public class GameApp {

    /*//u1이 u2를 공격하는 함수
    static void start(Zealot u1, Dragoon u2){
        //u1과 u2는 start 스택에 존재
        u2.hp -= u1.attack;
    }
    //start라는 함수를 오버로딩
    static void start(Dragoon u1, Zealot u2){
        u2.hp -= u1.attack;
    }
    static void start(Zealot u1, Zealot u2){
        u2.hp -= u1.attack;
    }
    static void start(Dragoon u1, Dragoon u2){
        u2.hp -= u1.attack;
    }*/

    static void start(Protoss u1, Protoss u2){
        u2.setHp(u2.getHp()- u1.getAttack());
    }

    public static void main(String[] args) {
        //오버로딩
        Zealot z1 = new Zealot();
        Zealot z2 = new Zealot();
        Dragoon d1 = new Dragoon();
        Dragoon d2 = new Dragoon();         //객체를 생성하여 인스턴스화 시킴

        start(z1, d1);
        System.out.println(d1.hp);
        start(d1, z1);
        System.out.println(z1.hp);
        start(z1, z2);
        System.out.println(z2.hp);
        start(d1, d2);
        System.out.println(d2.hp);

        //sout의 오버로딩
        System.out.println(10);
        System.out.println("String");
        System.out.println(10.5);
        System.out.println('A');
        System.out.println(true);
    }
}
