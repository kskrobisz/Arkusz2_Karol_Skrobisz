import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {


        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj wynik z testu pierwszego " );
        int ocena1 = klawisz.nextInt();

        System.out.println("Podaj wyniki z testu drugiego ");
        int ocena2 = klawisz.nextInt();

        System.out.println("Podaj wyniki z testu trzeciego ");
        int ocena3 = klawisz.nextInt();

        int oceny= ocena1 + ocena2 + ocena3;
        int srednia = oceny/3;

        if (srednia>=90) {
            System.out.println("Ocena 5! " + srednia);
        }
        else if (srednia>=80) {
            System.out.println("Ocena 4! " + srednia);
        }
        else if (srednia>=70) {
            System.out.println("Ocena 3! " + srednia);
        }
        else if (srednia>=60) {
            System.out.println("Ocena 2! " + srednia);
        }
        else {
            System.out.println("Ocena 1! " + srednia);
        }


    }
}

