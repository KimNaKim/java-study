package ex06.game;

public class Dragoon extends Protoss {
    int hp = 100;
    int attack = 5;

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public void setAttack(int attack) {
        this.attack = attack;
    }
}
