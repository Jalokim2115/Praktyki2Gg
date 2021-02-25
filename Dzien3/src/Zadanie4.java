public class Zadanie4 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {

                if (i * j % 2 == 0 && i * j % 3 == 0) {
                    System.out.print(i * j + "\t");
                }
                else{
                    System.out.print("x\t");
                }
            }
            System.out.println();

        }


        }
}