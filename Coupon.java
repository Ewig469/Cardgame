import java.util.Scanner;

public class Coupon{
    public static void main(String[] args){
        double CatPrice = 100.00;
        double DogPrice = 100.00;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give your coupon Code!");
        String code = scanner.nextLine().trim();

        if(code.equals("MEOW")){
            double RabattCatPrice = CatPrice * 0.8;
            System.out.println("u r Welcome" + RabattCatPrice);

        }else if(code.equals("WOLF")){

            double RabattDogPrice = DogPrice * 0.8;
            System.out.println("u r welcome" + "     " + RabattDogPrice);

        }else {
            System.out.println("no no no");
        }
    }
}