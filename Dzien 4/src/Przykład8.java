import java.util.Random;
import java.util.Scanner;

public class Przykład8 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz imie: ");
        String imie;
        imie = scanner.nextLine();
        System.out.println("Wybierz rasę: ");
        String rasa;
        rasa = scanner.nextLine();
        System.out.println("Wybierz klasę: ");
        String klasa;
        klasa = scanner.nextLine();
        System.out.println("Wybierz broń: ");
        String bron;
        bron = scanner.nextLine();
        System.out.println("Twoja Postać to : ");
        System.out.println("Nazwa: " + imie);
        System.out.println("Rasa: " + rasa);
        System.out.println("Klasa: " + klasa);
        System.out.println("Broń: " + bron);

    }
}
