import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {


        Scanner klawisz = new Scanner(System.in);

        System.out.println("Wprowadz liczbe kalori oraz gramów tłuszczu w produkcie: ");
        int kalorie = klawisz.nextInt();
        int tluszcz = klawisz.nextInt();

        double gram = tluszcz * 9;
        double suma = gram / kalorie;

        System.out.println("Procent kalori pochodzących z tłuszczy: "+suma*100+"%");

        if (suma<0.3){
            System.out.println("Produkt jest niskotłuszczowy");
        }
        else if (gram>kalorie){
            System.out.println("Dane wejściowe są nieprawidłowe");
        }
    }
}