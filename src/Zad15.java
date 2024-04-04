import java.util.Scanner;
public class Zad15 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj ilość czeków: \n ");
        int czek = klawisz.nextInt();

        if (czek < 20)
        {
            double oplaty = czek * 0.10;
            double cena = oplaty + 10;
            System.out.println("Opłaty przez bank wynoszą: " + cena );
        }
        else if ( czek >= 20 && czek <=39) {
            double oplaty = czek * 0.08;
            double cena = oplaty + 10;
            System.out.println("Opłaty przez bank wynoszą: " + cena );
        }
        else if (czek >=40 && czek <=59)
        {
            double oplaty = czek * 0.06;
            double cena = oplaty + 10;
            System.out.println("Opłaty przez bank wynoszą: " + cena );
        }
        else if (czek >=60)
        {
            double oplaty = czek * 0.04;
            double cena = oplaty + 10;
            System.out.println("Opłaty przez bank wynoszą: " + cena );
        }
    }
}