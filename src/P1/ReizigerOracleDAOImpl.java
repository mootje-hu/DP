package P1;

import P1.Reiziger;
import P1.ReizigerDAO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ReizigerOracleDAOImpl implements ReizigerDAO {
    private ArrayList<Reiziger> reizigers = new ArrayList<>();

    public ArrayList<Reiziger> findAll(){
        return reizigers;
    }

    public ArrayList<Reiziger> findByGBdatum(String GBdatum) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = dateFormat.parse(GBdatum);
        java.sql.Date datum = new java.sql.Date(date.getTime());

        ArrayList<Reiziger> gevondenReiziger = new ArrayList<>();
        for (Reiziger r: reizigers) {
            if(r.getGBdatum().equals(datum)){
                gevondenReiziger.add(r);
            }
        }
        return gevondenReiziger;
    }





    public Reiziger save(Reiziger reiziger) {
        if(!reizigers.contains(reiziger) && !(reiziger == null)) {
            reizigers.add(reiziger);
        }
        return reiziger;
    }

    public Reiziger update(Reiziger reiziger) {
        for (Reiziger r: reizigers) {
            if (r.equals(reiziger)) {
                r.setNaam(reiziger.getNaam());
                r.setGBdatum(reiziger.getGBdatum());
            }
        }
        return reiziger;
    }

    public boolean delete(Reiziger reiziger) {
        boolean verwijderd = false;
        if (!(reiziger == null) && reizigers.contains(reiziger)) {
            reizigers.remove(reiziger);
            verwijderd = true;
        }
        return verwijderd;
    }


}
