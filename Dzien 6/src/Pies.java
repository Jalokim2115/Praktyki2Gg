public class Pies extends Zwierze{
    private String sierść;
    private int dlugoscogona;

    public Pies(int wiek, int ilośćkonczyn, String nazwa, String sierść, int dlugoscogona) {
        super(wiek, ilośćkonczyn, nazwa);
        this.sierść = sierść;
        this.dlugoscogona = dlugoscogona;
    }
    @Override
    public void dajGlos(){
        System.out.println("Hau Hau");
    }

    public String getSierść() {
        return sierść;
    }

    public void setSierść(String sierść) {
        this.sierść = sierść;
    }

    public int getDlugoscogona() {
        return dlugoscogona;
    }

    public void setDlugoscogona(int dlugoscogona) {
        this.dlugoscogona = dlugoscogona;
    }
}