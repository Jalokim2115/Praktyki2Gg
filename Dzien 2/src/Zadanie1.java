public class Zadanie1 {
    public static void main(String[] args) {

        //Zadanie 1 Pętle

        char Letter = 'A';

        for (int i = 0; i < 26; i++)
        {
            if ( i % 2 == 0)
                System.out.print(Letter + " ");
            Letter++;
        }
    }
}


