import java.util.Scanner;
public class Zad12 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.print("Wpisz powietrze woda lub stal: \n");
        String	materia = klawisz.next();
        System.out.print("Podaj odleglosc: \n");
        double	odleglosc = klawisz.nextDouble();
        if(materia.equals("powietrze"))
        {
            double czas = odleglosc/343;
            System.out.print("Czas wynosi: \n" +czas);

        }
        else if(materia.equals("woda"))
        {
            double czas = odleglosc/1490;
            System.out.print("Czas wynosi: \n" +czas);
        }
        else if(materia.equals("stal"))
        {
            double czas = odleglosc/5100;
            System.out.print("Czas wynosi: \n" +czas);
        }
    }
}
