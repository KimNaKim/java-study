package ex06.ch02;

//변수의 상속
class Animal {
    int i = 1;
    String name = "동물";
}

class Cat extends Animal {
    int i = 2;
    String name = "고양이";
    int age = 5;
}

class Dog extends Animal {
    int i = 3;
    String name = "강아지";
}

public class ExVar01 {
    public static void main(String[] args) {
        Animal A1 = new Animal();
        Animal C1 = new Cat();
        Animal D1 = new Dog();
        Cat C2 = new Cat();
        Dog D2 = new Dog();
        Animal[] animals = new Animal[5];
        animals[0] = A1;
        animals[1] = C1;
        animals[2] = D1;
        animals[3] = C2;
        animals[4] = D2;

        //Dog(v), Animal
        System.out.println("D2의 종류 : " + D2.name);

        //Animal(v), Dog
        System.out.println("D1의 종류 : " +D1.name);

        //Cat(v), Animal
        System.out.println("C2의 나이 : " + C2.age);
        System.out.println("C2의 종류 : " + C2.name);

        //Animal(v), Cat
        System.out.println("C1의 종류 : " + C1.name);

        for(Animal a : animals){
            System.out.println(a + "의 클래스 타입 : " + a.getClass());
        }
    }
}
