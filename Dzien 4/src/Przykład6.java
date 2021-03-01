public class Przykład6 {

    public static void main (String [] args){

        double[] array = {23.45,-2.22,45.90,67.45,-56,-77,-34.8,90.4,234.11};
        int i=0;

        System.out.println("Przed odwróceniem");
        System.out.println();

        for(i = 0; i < 9; i++)
        {
            System.out.println("Element " + "[" + i + "] " + array[i]);
        }
        System.out.println( );
        System.out.println("Po odwróceniu");
        System.out.println( );

        for(i = 8; i > -1; i--)
        {
            System.out.println("Element " + "[" + i + "] " + array[i]);
        }
    }
}
