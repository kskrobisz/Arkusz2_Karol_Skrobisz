import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {

        Scanner klawisz = new Scanner(System.in);

        System.out.println("Wprowadź liczbę zakupionych pakietów: ");
        int liczba = klawisz.nextInt();

        if (liczba>=100){
            double pakiet=liczba*99;
            double rabat=pakiet*0.5;
            double kwota=pakiet-rabat;
            System.out.println("Przyznany rabat: 50%");
            System.out.println("Łączna kwota do zapłaty: "+kwota);
        }
        else if (liczba>=50){
            double pakiet=liczba*99;
            double rabat=pakiet*0.4;
            double kwota=pakiet-rabat;
            System.out.println("Przyznany rabat: 40%");
            System.out.println("Łączna kwota do zapłaty: "+kwota);
        }
        else if (liczba>=20){
            double pakiet=liczba*99;
            double rabat=pakiet*0.3;
            double kwota=pakiet-rabat;
            System.out.println("Przyznany rabat: 30%");
            System.out.println("Łączna kwota do zapłaty: "+kwota);
        }
        else if (liczba>=10){
            double pakiet=liczba*99;
            double rabat=pakiet*0.2;
            double kwota=pakiet-rabat;
            System.out.println("Przyznany rabat: 20%");
            System.out.println("Łączna kwota do zapłaty: "+kwota);
        }
        else if (liczba>=0){
            double pakiet=liczba*99;
            System.out.println("Przyznany rabat: nie przyznano rabatu");
            System.out.println("Łączna kwota do zapłaty: "+pakiet);
        }
    }
}