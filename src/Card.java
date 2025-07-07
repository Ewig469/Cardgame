public class Card {
    private String name;
    private int attack;
    private int health;
    private int move;
    private int posX;
    private int posY;
    private Battlefeld bf;

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

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

//    boolean canMove(){
//        if(posX - move < 0 || posX + move > 4)
//    }

    public void move(int direction){
        if(direction == 0){ //上
            posX -= move;
        }

        if(direction == 1){ //下
            posX += move;
        }

        if(direction == 2){ //左
            posY -= move;
        }

        if(direction == 3){ //右
            posY += move;
        }
    }

    @Override
    public String toString() {
        return "卡牌名称：" + name + " 攻击力：" + attack + " 生命值：" + health + " 步数：" + move;
    }
}
