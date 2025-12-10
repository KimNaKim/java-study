package ex08.comp;

public class Potato {
    private String name;
    private int price;

    public Potato(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println(name + "이(가) 만들어졌습니다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Potato{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
