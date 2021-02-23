public class Zadanie2 {
    public static void main(String[] args) {


        //Zadanie 2 Petle

        int x = 7;
        int pierwsza = 1;
        int druga = 1;
        int Fibonacci = 1;


        System.out.print(pierwsza + "\t" + druga);
        for(int i = 3; i <= x; i++){


            Fibonacci = pierwsza + druga;
            pierwsza = druga;
            druga = Fibonacci;
            System.out.print("\t" + Fibonacci);
        }
    }
}
