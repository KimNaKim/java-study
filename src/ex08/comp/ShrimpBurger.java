package ex08.comp;

public class ShrimpBurger extends Burger{
    private String material;

    public ShrimpBurger(String name, int price, String material) {
        super(name, price);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}
