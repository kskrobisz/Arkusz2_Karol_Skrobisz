import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj dzień(w formie liczby): ");
        int dzien = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Podaj miesiąc(w formie liczby): ");
        int miesiac = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Podaj dwie ostatnie cyfry roku(w formie liczby): ");
        int rok = keyboard.nextInt();
        keyboard.nextLine();

        if (dzien*miesiac==rok){
            System.out.println("Ta data jest magiczna");
        }
        else {
            System.out.println("Ta data nie jest magiczna");
        }
    }
}