package P2;


import java.sql.Date;

public class OVChipkaart {
    private int kaartNummer;
    private Date geldigTot;
    private int klasse;
    private float saldo;
    private Reiziger eigenaar;


    public OVChipkaart() {
    }

    public OVChipkaart(int kaartNummer, Date geldigTot, int klasse, float saldo, Reiziger eigenaar) {
        this.kaartNummer = kaartNummer;
        this.geldigTot = geldigTot;
        this.klasse = klasse;
        this.saldo = saldo;
        this.eigenaar = eigenaar;
    }

    public int getKaartNummer() {
        return kaartNummer;
    }

    public void setKaartNummer(int kaartNummer) {
        this.kaartNummer = kaartNummer;
    }

    public Date getGeldigTot() {
        return geldigTot;
    }

    public void setGeldigTot(Date geldigTot) {
        this.geldigTot = geldigTot;
    }

    public int getKlasse() {
        return klasse;
    }

    public void setKlasse(int klasse) {
        this.klasse = klasse;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Reiziger getEigenaar() {
        return eigenaar;
    }

    public void setEigenaar(Reiziger eigenaar) {
        this.eigenaar = eigenaar;
    }

    public String toString() {
        return "[" + this.getClass().getSimpleName() + "] {" + kaartNummer + ", " + klasse + "e klasse tot "
                + geldigTot + ", € " + saldo + ", eigendom van " + eigenaar.getNaam() + "}";
    }
}
