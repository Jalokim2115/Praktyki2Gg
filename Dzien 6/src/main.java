public class main {
    public  static void main(String[] args){
        //zad 1
        System.out.println("Zad 1");
        Kwadrat kwadrat = new Kwadrat(4);
        System.out.println(kwadrat.Pole());

        Prostokat prostokat = new Prostokat(2,4);
        System.out.println(prostokat.Pole());

        //zad 2
        System.out.println("Zad 2");
        Pies pies = new Pies(5,4,"Typtus","Biała",12);
        pies.dajGlos();
        //zad 3
        System.out.println("Zad 3");
        Spawacz spawacz = new Spawacz(2000,"pełny",true,true);
        spawacz.wykonujePrace();
        //zad 4
        System.out.println("Zad 4");
        System.out.println(" Która metoda przysłania metodę z klasy nadrzędnej/superclass?\n (bez methodOne bo jest to inny typ zmiennej), methodTwo, methodFour");
        System.out.println(" Która metoda jest ukryta/niewidzialna w klasie B?\nmethodThree i medtodOne");


    }

}