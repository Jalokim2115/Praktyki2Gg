public class main {
    public static void main(String[] args) {
        //zad 1
        System.out.println("Zad 1");
        Pies pies = new Pies();
        pies.wiek();
        pies.wydajDzwiek();
        pies.sen();
        pies.Ciągnięcie();
        System.out.println();
        //zad 2
        System.out.println("Zad 2");
        samochod samochod = new samochod();
        System.out.println(samochod.awaria());
        samochod.jedzDoPrzodu();
        samochod.skrecwLewo();
        samochod.skrecwPrawo();
        samochod.stop();
        //zad 3
        System.out.println();
        System.out.println("Zad 3");
        Podajroocznikwina podajroocznikwina = new Podajroocznikwina();
        podajroocznikwina.bulgocze();
        podajroocznikwina.nalewasie();
        podajroocznikwina.rocznik();
        podajroocznikwina.jestodkorkowywane();
        podajroocznikwina.jestpite();
        //zad 4
        System.out.println();
        System.out.println("Zad 4");
        pies.badzMilutki();
        pies.bawsie();
        //zad 5
        System.out.println();
        System.out.println("Zad 5");
        Kwadrat kwadrat = new Kwadrat(6);
        System.out.println("Obw = "+kwadrat.obliczObw()+"\n"+"Pole = "+kwadrat.obliczPole());
    }
}