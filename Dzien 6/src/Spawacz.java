public class Spawacz extends Praca{
    boolean niebezpieczna;

    public Spawacz(int pensja, String etat, boolean fajna, boolean niebezpieczna) {
        super(pensja, etat, fajna);
        this.niebezpieczna = niebezpieczna;
    }

    @Override
    public void wykonujePrace(){
        System.out.println("Spawa");
    }
}