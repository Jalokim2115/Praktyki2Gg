public class Pies extends Zwierze implements ZwierzeDomowe{

    @Override
    public int wiek() {
        return 5;
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("Hau Hau");

    }

    @Override
    public void badzMilutki() {
        System.out.println("Jest milutki");
    }

    @Override
    public void bawsie() {
        System.out.println("Bawi sie");

    }
}