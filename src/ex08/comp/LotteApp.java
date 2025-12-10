package ex08.comp;

public class LotteApp {
    static void main() {
        //1. 버거만 주세요
        Burger burger1 = new Burger("기본버거", 5000);
        System.out.println(burger1);
        System.out.println();

        //2. 콜라만 주세요
        Coke coke1 = new Coke("펩시제로", 1000);
        System.out.println(coke1);
        System.out.println();

        //3. 쉬림프버거 세트 주세요
        BurgerSet bs1 = new BurgerSet(
                new ShrimpBurger("새우버거",6000,"새우")
                , new Coke("코카콜라", 1000)
                , new Potato("감자", 500));
        System.out.println(bs1.getTotalPrice());
    }
}
