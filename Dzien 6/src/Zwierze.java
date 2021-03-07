public class Zwierze {
    private int wiek;
    private int ilośćkonczyn;
    private String nazwa;

    public Zwierze(int wiek, int ilośćkonczyn, String nazwa) {
        this.wiek = wiek;
        this.ilośćkonczyn = ilośćkonczyn;
        this.nazwa = nazwa;
    }
    public void dajGlos(){
        System.out.println("Daj głos");
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getIlośćkonczyn() {
        return ilośćkonczyn;
    }

    public void setIlośćkonczyn(int ilośćkonczyn) {
        this.ilośćkonczyn = ilośćkonczyn;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}