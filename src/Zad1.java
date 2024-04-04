import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        int x;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj liczbę od 1 do 10 :");
        x = keyboard.nextInt();

        if (x == 1) {
            System.out.println("Odpowiednik wartośći w liczbie rzymskiej: I");
        }

        else if (x == 2) {
            System.out.println("Odpowiednik wartośći w liczbie rzymskiej: II");
        }
        else if (x == 3) {
            System.out.println("Odpowiednik wartośći w liczbie rzymskiej: III");
        }
        else if (x == 4) {
            System.out.println("Odpowiednik wartośći w liczbie rzymskiej: IV");
        }
        else if (x == 5) {
            System.out.println("Odpowiednik wartośći w liczbie rzymskiej: V");
        }
        else if (x == 6) {
            System.out.println("Odpowiednik wartośći w liczbie rzymskiej: VI");
        }
        else if (x == 7) {
            System.out.println("Odpowiednik wartośći w liczbie rzymskiej: VII");
        }
        else if (x == 8) {
            System.out.println("Odpowiednik wartośći w liczbie rzymskiej: VIII");
        }
        else if (x == 9) {
            System.out.println("Odpowiednik wartośći w liczbie rzymskiej: IX");
        }
        else if (x == 10) {
            System.out.println("Odpowiednik wartośći w liczbie rzymskiej: X");
        }
        else if  (x >10 | x <0) {
            System.out.println("Niepoprawna liczba!");
        }
    }
}
