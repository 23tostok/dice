import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose number of sides");
        
        Dice sixSide = new Dice();

        sixSide.sides = input.nextInt();

        sixSide.roll();
    }

    static class Dice {
        int sides;

        void roll() {
            System.out.println(Math.floor(Math.random() * (sides + 1)));
        }
    }

}
