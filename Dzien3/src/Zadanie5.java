public class Zadanie5 {

    public static void main(String[] args) {

        System.out.println();
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {

                if (i >= j) {
                    System.out.print("x\t");
                } else {
                    System.out.print("\t");
                }


            }
            System.out.println();
        }
    }
}
