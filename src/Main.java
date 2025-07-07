public class Main {
    public static void main(String[] args) {
        Card card1 = new Card("你妈死了",5, 10, 1);

        System.out.println(card1);

        Battlefeld b1 = new Battlefeld();
        b1.addCard(8, 3, card1);
        b1.printBattlefeld();
    }
}