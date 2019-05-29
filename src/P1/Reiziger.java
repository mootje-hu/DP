package P1;

import java.sql.Date;

public class Reiziger {
    private String naam;
    private Date gbdatum;

    public Reiziger(String nm, Date gb) {
        naam = nm;
        gbdatum = gb;
    }

    public String getNaam() {
        return naam;
    }

    public Date getGBdatum() {
        return gbdatum;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setGBdatum(Date gbdatum) {
        this.gbdatum = gbdatum;
    }

    public String toString() {
        return naam + " " + gbdatum;
    }
}
