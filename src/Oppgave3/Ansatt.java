package Oppgave3;

public class Ansatt {

    private String fornavn;
    private String etternavn;
    private String kjonn;
    private String stilling;
    private int aarslonn;




    public Ansatt(String fornavn, String etternavn, String kjonn, String stilling, int aarslonn) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.kjonn = kjonn;
        this.stilling = stilling;
        this.aarslonn = aarslonn;
    }

    public String getEtternavn() { return etternavn; }

    public void setEtternavn(String etternavn) { this.etternavn = etternavn; }

    public String getKjonn() { return kjonn; }

    public void setKjonn(String kjonn) { this.kjonn = kjonn; }

    public String getStilling() { return stilling; }

    public void setStilling(String stilling) { this.stilling = stilling; }

    public String getFornavn() { return fornavn; }

    public void setFornavn(String fornavn) { this.fornavn = fornavn;}

    public int getAarslonn() {
        return aarslonn;
    }

    public void setAarslonn(int aarslonn) {
        this.aarslonn = aarslonn;
    }

    @Override
    public String toString() {
        return "Ansatt{" +
                "fornavn='" + fornavn + '\'' +
                ", etternavn='" + etternavn + '\'' +
                ", kjonn='" + kjonn + '\'' +
                ", stilling='" + stilling + '\'' +
                ", aarslonn=" + aarslonn +
                '}';
    }
}
