package ex06.ch01;


//구체적 클래스&추상적 클래스
class Earthian{                     //지구인

}
class Europian extends Earthian{    //유럽인

}
class Asian extends Earthian{       //아시아인
    String color = "yellow";
}
class Korean extends Asian{         //한국인

}
class Japanese extends Asian{       //일본인

}
class English extends Europian{     //영국인

}

public class Ex02 {
    public static void main(String[] args) {
        Earthian p1 = new Europian();   //유럽인은 지구인이다
        Earthian p2 = new Asian();      //아시아인은 지구인이다
        Europian p3 = new English();    //영국인은 유럽인이다
        Asian p4 = new Japanese();      //일본인은 아시아인이다
        Asian p5 = new Korean();        //한국인은 아시아인이다
        Earthian p6 = new Korean();     //한국인은 지구인이다
        Earthian p7 = new English();    //영국인은 지구인이다
        Korean p8 = new Korean();
        //하위 클래스는 타입 선택의 다양성이 존재(다형성)

        System.out.println(p5.color);
        //System.out.println(p6.color);   //오류 출력
        System.out.println(p8.color);
    }
}
