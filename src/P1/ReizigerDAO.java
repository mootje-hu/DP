package P1;

import P1.Reiziger;

import java.text.ParseException;
import java.util.ArrayList;

public interface ReizigerDAO {
    public ArrayList<Reiziger> findAll();
    public ArrayList<Reiziger>findByGBdatum(String GBdatum) throws ParseException;
    public Reiziger save (Reiziger reiziger);
    public Reiziger update (Reiziger reiziger);
    public boolean delete (Reiziger reiziger);
}
