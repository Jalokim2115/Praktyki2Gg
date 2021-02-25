import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean programdziala = true;

        while(programdziala)
        {
            System.out.println("Wybierz drzwi: ");
            int wybranedrzwi = sc.nextInt();

            switch (wybranedrzwi)
            {
                case 1 -> System.out.println("Wybrałeś złe drzwi!");
                case 2 -> System.out.println("Wybrałeś złe drzwi!");
                case 3 -> {
                    programdziala = false;
                    System.out.println("Wybrałeś poprawne drzwi! Wychodzisz z lochu");
                }
                case 4 -> System.out.println("Wybrałeś złe drzwi!");
                case 5 -> System.out.println("Wybrałeś złe drzwi!");
                default -> System.out.println("Podałeś złe dane!");
                }
            }
        }
    }

