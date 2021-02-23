public class Main {
    // tutaj stworzymy sobie metode main (czyli metode główną)
    public static void main(String[] args) {
        // Zadanie 1

        int intA;
        double doubleA;
        char charA;
        String StringA;
        System.out.println();

        // Zadanie 2

        System.out.println("Zadanie 2");
        int a = 3;
        int b = 4;
        int Wynik = (a* a + b * b);
        System.out.println("Wynik = " + Wynik  );

        // Zadanie 3

        System.out.println("Zadanie 3");
        double Bok = 7;
        double PolPodstawy = 3.5;
        double Wysokosc = Math.sqrt(Bok * Bok - PolPodstawy * PolPodstawy);
        double Pole = Bok * Wysokosc / 2 ;
        System.out.println("Pole = " + Pole);

        // Zadanie 4

        System.out.println("Zadanie 4");
        String Imie = "Mikołaj";
        String Nazwisko = "Mozoluk";
        System.out.println(Imie + "\t"+ Nazwisko);



    }
}
