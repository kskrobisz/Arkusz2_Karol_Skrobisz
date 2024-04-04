import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {

        Scanner klawisz = new Scanner(System.in);

        System.out.println("Wprowadź wagę przesyłki: ");
        int waga = klawisz.nextInt();
        System.out.println("Wprowadź odległość przesyłki: ");
        int droga = klawisz.nextInt();


        if (waga>5) {
            int licznik= droga/501;
            double koszt=licznik*3.80;
            System.out.println("Koszt przesyłki: "+koszt+"zł");
        }
        else if (waga>3) {
            int licznik= droga/501;
            double koszt=licznik*3.70;
            System.out.println("Koszt przesyłki: "+koszt+"zł");
        }
        else if (waga>1) {
            int licznik= droga/501;
            double koszt=licznik*2.20;
            System.out.println("Koszt przesyłki: "+koszt+"zł");
        }
        else {
            int licznik= droga/501;
            double koszt=licznik*1.10;
            System.out.println("Koszt przesyłki: "+koszt+"zł");
        }
    }
}