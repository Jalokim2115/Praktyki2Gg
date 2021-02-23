public class Zadanie2 {
    public static void main(String[] args) {


        //Zadanie 2 Petle

        int x = 7;
        int pierwsza = 0;
        int druga = 1;
        int Fibonacci;



        for(int i = 1; i <= x; i++){


            Fibonacci = pierwsza + druga;
            System.out.print(Fibonacci + "\t");
            pierwsza = druga;
            druga = Fibonacci;

        }
    }
}
