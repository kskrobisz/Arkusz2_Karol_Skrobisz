import java.util.Scanner;
public class Zad13 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double oplaty;
        double wynik;
        double cenaa = 39.99 ;
        double cenab =59.99;
        double cenac = 69.99;
        System.out.println("Podaj twoj pakiet ( A B C) \n");
        String pakiet = klawisz.next();
        String pakietel = pakiet.toUpperCase();

        if (pakietel.equals("A")) {
            System.out.println("Pakiet A. Podaj ilość minut: ");
            double minut = klawisz.nextDouble();
            oplaty = (minut - 450) * 0.40;
            wynik = oplaty + cenaa;
            {
                if(minut<=450) {
                    System.out.println("Wynik to: " + cenaa+"zł");
                }
                else System.out.println("Wynik to: "+ wynik+"zł");
            }
        }
        else if (pakietel.equals("B")) {

            System.out.println("Pakiet B. Podaj ilość minut: ");
            double	minut = klawisz.nextDouble();
            oplaty = (minut - 900) * 0.45;
            wynik = oplaty + cenab;
            {
                if(minut<=900) {
                    System.out.println("Wynik to: " + cenab+"zł");
                }
                else System.out.println("Wynik to: "+ wynik+"zł");
            }
        }

        else if (pakietel.equals("C")) {

            System.out.println("Pakiet C. Podaj ilość minut: ");
            double minut = klawisz.nextDouble();

            System.out.println("Wynik to: "+ cenac+"zł");

        }
        else
            System.out.println("Zły wybrany pakiet ");
    }
}



