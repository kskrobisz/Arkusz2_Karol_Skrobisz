import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {

        Scanner klawisz = new Scanner(System.in);

        System.out.println("Wprowadź trzy imiona: ");
        String imie1 = klawisz.nextLine();
        String imie2 = klawisz.nextLine();
        String imie3 = klawisz.nextLine();


        if (imie1.compareTo(imie2) < 0){
            System.out.println(imie1 + " jest pierwszy alfabetycznie  " );
        }

        else if (imie1.compareTo(imie2) == 0) {
            System.out.println(imie1 + " jest równy względem " + imie2 + ".");
        }

        else if (imie1.compareTo(imie2) > 0){
            System.out.println(imie2 + " jest pierwszy alfabetycznie");
        }


    }
}
