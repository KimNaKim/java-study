package ex08.comp;


// 상속은 1개만 가능하기 때문에 3개를 모두 상속받을 수는 없음
// is(상속) & can do(인터페이스)
// composite/composition - has 관계
public class BurgerSet {
    private Burger burger;
    private Coke coke;
    private Potato potato;

    public BurgerSet(Burger burger,Coke coke, Potato potato) {
        this.potato = potato;
        this.coke = coke;
        this.burger = burger;
        System.out.println(burger.getName() + "세트가 만들어졌습니다.");
    }

    public int getTotalPrice(){
        int totalPrice = burger.getPrice() + coke.getPrice() + potato.getPrice();
        return (int)(totalPrice * 0.9);
    }

    @Override
    public String toString() {
        return "BurgerSet{" +
                "burger=" + burger +
                ", coke=" + coke +
                ", potato=" + potato +
                '}';
    }
}
