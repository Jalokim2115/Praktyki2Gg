public class okrag {
    private double srednica;
    private double promien;

    public okrag(double srednica, double promien) {
        this.srednica = srednica;
        this.promien = srednica/2;
    }
    public double Pole(){
        return promien * promien * 3;
    }
    public double Obwod(){
        return 2*3*promien;
    }

    public double getSrednica() {
        return srednica;
    }

    public void setSrednica(double srednica) {
        this.srednica = srednica;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }
}