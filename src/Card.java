public class Card {
    private String name;
    private int attack;
    private int health;
    private int move;
    int posX;
    int posY;

    public Card(String name, int attack, int health, int move){
        this.name = name;
        this.attack = attack;
        this.health = health;
        this.move = move;
    }


    public int getAttack() {
        return attack;
    }

    public int getMove() {
        return move;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMove(int move) {
        this.move = move;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "卡牌名称：" + name + " 攻击力：" + attack + " 生命值：" + health + " 步数：" + move;
    }
}
