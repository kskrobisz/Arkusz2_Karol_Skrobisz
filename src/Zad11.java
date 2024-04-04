import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {

        Scanner klawisz = new Scanner(System.in);

        System.out.println("Wprowadź nazwisko oraz czas ukończenia pierwszego biegacza: ");
        String imie1 = klawisz.nextLine();
        int czas1 = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Wprowadź nazwisko oraz czas ukończenia drugiego biegacza: ");
        String imie2 = klawisz.nextLine();
        int czas2 = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Wprowadź nazwisko oraz czas ukończenia trzeciego biegacza: ");
        String imie3 = klawisz.nextLine();
        int czas3 = klawisz.nextInt();
        klawisz.nextLine();

        if(czas1<czas2&&czas1<czas3){
            if(czas2<czas3){
                System.out.println(imie1+"\n"+imie2+"\n"+imie3);
            }
            else{
                System.out.println(imie1+"\n"+imie3+"\n"+imie2);
            }
        }
        if(czas2<czas1&&czas2<czas3){
            if(czas1<czas3){
                System.out.println(imie2+"\n"+imie1+"\n"+imie3);
            }
            else{
                System.out.println(imie2+"\n"+imie3+"\n"+imie1);
            }
        }
        if(czas3<czas2&&czas3<czas1){
            if(czas1<czas2){
                System.out.println(imie3+"\n"+imie1+"\n"+imie2);
            }
            else{
                System.out.println(imie2+"\n"+imie2+"\n"+imie1);
            }
        }

    }
}
