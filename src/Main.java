public class Main {
    public static void main(String[] args) {
        Card card1 = new Card("军团步兵",5, 10, 1);
        Card card2 = new Card("督战队",2,6,1 );
        System.out.println(card1);

        Battlefeld b1 = new Battlefeld();
        b1.addCard(3, 8, card1);
        b1.addCard(4, 3, card2);
        b1.printBattlefeld();
        System.out.println((card1.getPosY() + 1) + " " + (card1.getPosX() + 1));
        b1.moveCard(card1, 0);
        b1.printBattlefeld();
    }
}