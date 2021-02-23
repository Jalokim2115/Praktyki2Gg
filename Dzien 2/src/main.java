public class main {
    public static void main(String[] args) {

        //wypisanie liczb od 0 do 10
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }

        //sumowanie liczb

        int suma = 0;
        for (int i = 0; i <= 12; i++) {
            suma += i;
        }
        System.out.println();
        System.out.println("Suma\n" + suma);

        //podwojny for (do tablic)

        System.out.println();
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {

                System.out.print(i + j + "\t");
            }
            System.out.println();

        }

        //podwojny for tabliczka mnozenia

        System.out.println();
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {

                System.out.print(i*j + "\t");
            }
            System.out.println();

        }
        System.out.println();

        //petla while
        int a = 10;
        int b = 0;

        while(a >b){
            a--;
            System.out.print(a + " ");
        }









    }
}
