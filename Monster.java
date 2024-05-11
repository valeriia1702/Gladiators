public class Monster {
    public String name;
    public int basicAttack;
    public int hp;

    public String getName() {
        return name;
    }

    public int getBasicAttack() {
        return basicAttack;
    }

    public int getHp() {
        return hp;
    }

    public Monster(String name, int basicAttack, int hp) {
        this.name = name;
        this.basicAttack = basicAttack;
        this.hp = hp;
    }
}
