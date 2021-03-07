import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        //zad 1
        System.out.println("Zad 1");
        Trojkat trojkat = new Trojkat(1,2,30);
        trojkat.ObliczPole();
        System.out.println(trojkat.getPole());
        //zad 2
        System.out.println("Zad 2");
        Prostokat prostokat = new Prostokat(5,6);
        prostokat.PoleProstokat();
        System.out.println(prostokat.PoleProstokat());
        prostokat.Przekatne();
        System.out.println(prostokat.Przekatne());
        prostokat.setBokA(3);
        System.out.println(prostokat.getBokA());
        //zad 3
        System.out.println("Zad 3");
        if(trojkat.getBokA()> prostokat.getBokA()){
            System.out.println("Bok trójkąta o wielkości "+trojkat.getBokA()+" jest większy od boka prostokąta o wielkośći "+prostokat.getBokA());
        }
        if(trojkat.getBokA()< prostokat.getBokA()) {
            System.out.println("Bok prostokąta o wielkości " + prostokat.getBokA() + " jest większy od boka trójkąta o wielkośći " + trojkat.getBokA());
        }
        //zad 4 #1
        System.out.println("Zad 4");
        Scanner scan = new Scanner(System.in);
        boolean dzialaProgram = true;
        while(dzialaProgram) {
            ProstyKalkulator prostyKalkulator = new ProstyKalkulator();
            System.out.println("1-dodawanie, 2-odejmowanie, 3-mnożenie, 4-dzielenie, 5-stop");
            int choice = scan.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Wybrałeś dodawanie. Wybierz liczby: ");
                    double a = scan.nextDouble();
                    double b = scan.nextDouble();
                    System.out.println("Dodawnie = "+prostyKalkulator.dodawanie(a,b));
                    break;
                case 2:
                    System.out.println("Wybrałeś odejmowanie. Wybierz liczby: ");
                    double c = scan.nextDouble();
                    double d = scan.nextDouble();
                    System.out.println("Odejmnowanie = "+prostyKalkulator.odejmowanie(c,d));
                    break;
                case 3:
                    System.out.println("Wybrałeś mnożenie. Wybierz liczby: ");
                    double e = scan.nextDouble();
                    double f = scan.nextDouble();
                    System.out.println("Mnożenie = "+prostyKalkulator.mnozenie(e,f));
                    break;
                case 4:
                    System.out.println("Wybrałeś dzielenie. Wybierz liczby: ");
                    double g = scan.nextDouble();
                    double h = scan.nextDouble();
                    System.out.println("Dzielenie = "+prostyKalkulator.dodawanie(g,h));
                    break;
                case 5:
                    System.out.println("Zdecydowałeś się na zakończenie korzystanie z naszego kalkulatora. Życzymy miłego dnia!");
                    dzialaProgram = false;
                    break;
            }
        }
        //zad 4 #2
        System.out.println("Zad 4 #2 \n Jeśli podasz złą wielkość promienia Poprawimy cię :)");
        okrag okrag = new okrag(8,5);
        System.out.println("Pole= "+okrag.Pole()+"\n Obwod= "+okrag.Obwod());
        System.out.println(okrag.getPromien());

    }
}
