import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj swoją wagę: ");
        int waga = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Podaj swój wzrost: ");
        double wzrost = keyboard.nextDouble();
        wzrost=wzrost/100;

        double bmi = waga/(wzrost*wzrost);

        if (bmi<18.5){
            System.out.println("Masz niedowagę");
        }
        else if (bmi>25){
            System.out.println("Masz nadwagę");
        }
        else {
            System.out.println("Masz optymalna wagę");
        }
    }
}
