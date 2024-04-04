import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {


        Scanner klawisz = new Scanner(System.in);

        System.out.println("Wprowadź liczbę sekund: ");
        int sekundy = klawisz.nextInt();

        if(sekundy>=86400){
            int dzien=sekundy/86400;
            System.out.println("Liczba dni: "+dzien);
        }
        else if(sekundy>=3600){
            int godzina=sekundy/3600;
            System.out.println("Liczba godzin: "+godzina);
        }
        else if(sekundy>=60){
            int minuta=sekundy/60;
            System.out.println("Liczba minut: "+minuta);
        }


    }
}