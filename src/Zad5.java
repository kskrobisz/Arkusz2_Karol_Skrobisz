import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {


        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj masę obiektu(w kg): ");
        int masa = klawisz.nextInt();

        double ciezar = masa*9.8;

        if (ciezar>1000){
            System.out.printf("Obiekt jest zbyt ciężki");
        }
        else if (ciezar<10){
            System.out.printf("Obiekt jest za lekki");
        }


    }
}
