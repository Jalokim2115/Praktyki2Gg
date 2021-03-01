import java.util.Random;

public class Przykład7 {

    public static void main (String [] args){

        double[] array = {23.45,-2.22,45.90,67.45,-56,-77,-34.8,90.4,234.11};
        int i=0;

        for(i = 0; i < 9; i++)
        {
            System.out.println("Element " + "[" + i + "] " + array[i]);
        }
        System.out.println( );
        Random random = new Random();
        int losowa1 = random.nextInt(9);
        int losowa2 = random.nextInt(9);

        if (array[losowa1] > array[losowa2])
        {
            System.out.println("liczba " + array[losowa1] + " jest większa od liczby " + array[losowa2]);

        }
        if (array[losowa1] < array[losowa2])
        {
            System.out.println("liczba " + array[losowa1] + " jest mniejsza od liczby " + array[losowa2]);

        }
        if (array[losowa1] == array[losowa2])
        {
            System.out.println("liczba " + array[losowa1] + " jest równa liczbie " + array[losowa2]);

        }


    }
}
