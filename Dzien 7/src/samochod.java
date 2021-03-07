public class samochod implements Pojazd{
    @Override
    public void jedzDoPrzodu()
    {
        System.out.println("Jade do przodu");
    }
    @Override
    public void stop()
    {
        System.out.println("Zatrzymuje się");
    }
    @Override
    public boolean awaria()
    {
        return false;
    }

    @Override
    public void skrecwLewo() {
        System.out.println("skręt w lewo");

    }

    @Override
    public void skrecwPrawo() {
        System.out.println("skret w prawo");

    }
}