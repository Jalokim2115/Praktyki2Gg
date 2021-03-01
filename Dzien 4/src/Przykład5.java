public class Przykład5 {

    public static void main (String [] args){

        double[] power = {23.45,-2.22,45.90,67.45,-56,234.11,-34.8,90.4,-77};
        double min = power[0];
        double max = power[0];
        int miejscemin = 0;
        int miejscemax = 0;
        int i=0;

        System.out.println("Przed zamianą liczby największej z najmniejszą miejscami");
        System.out.println();

        for(i = 0; i<9; i++)
        {
            if(max < power[i])
            {
                max = power[i];
                miejscemax = i;
            }
            if(min > power[i])
            {
                min = power[i];
                miejscemin = i;
            }

            System.out.println("element [" + i + "] = " + power[i]);
        }

        power[miejscemax] = min;
        power[miejscemin] = max;

        System.out.println( );
        System.out.println("Po zamianie liczby największej z najmniejszą miejscami");
        System.out.println( );
        for(i = 0; i < 9; i++)
        {
            System.out.println("Element [" + i + "] = " + power[i]);
        }




    }
}
