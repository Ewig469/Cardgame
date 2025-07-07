import java.util.ArrayList;

public class Battlefeld {
    private int xs = 5;
    private int ys = 10;
    ArrayList<ArrayList<Card>> matrix = new ArrayList<>();

    public Battlefeld(){
        for(int i = 0; i < ys; i++){
            ArrayList<Card> y = new ArrayList<>();
            for (int j = 0; j < xs; j++) {
                y.add(null); // 初始为空
            }
            matrix.add(y);
        }
    }

    public void printBattlefeld(){
        for(ArrayList<Card> y : matrix){
            for(Card card : y){
                System.out.print((card == null ? "[Empty]" : "[" + card + "]") + "\t");
            }
            System.out.println();
        }
    }

    public void addCard(int x, int y, Card card){
        matrix.get(x-1).set(y-1, card);
    }
}
