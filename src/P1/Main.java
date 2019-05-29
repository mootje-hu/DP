package P1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Main {
        public static void main(String[] args) throws ParseException {


            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyy");


            String gb1 ="24-12-1999";
            java.util.Date date = dateFormat.parse(gb1);
            java.sql.Date gbMohamed = new java.sql.Date(date.getTime());

            Reiziger reiziger1 = new Reiziger("Mohamed", gbMohamed);


            String gb2 ="15-11-1999";
            date = dateFormat.parse(gb2);
            java.sql.Date gbTunahan = new java.sql.Date(date.getTime());

            Reiziger reiziger2 = new Reiziger("Tunahan", gbTunahan);


            ReizigerOracleDAOImpl rOdl = new ReizigerOracleDAOImpl();

            rOdl.save(reiziger1);
            rOdl.save(reiziger2);

            System.out.println(rOdl.findAll() + "\n" );

            reiziger1.setNaam("Hans");
            rOdl.update(reiziger1);

            System.out.println("Na de update: " + "\n" + rOdl.findAll() + "\n" );

            //Deleten van reizigers.
            rOdl.delete(reiziger2);

            //print alle reizigers
            System.out.println("Na de delete: " + "\n" + rOdl.findAll() + "\n" );

            //reiziger zoeken op geboortedatum
            ArrayList<Reiziger> gevondenReiziger = rOdl.findByGBdatum(gb1);
            System.out.println("De gevonden reiziger is: " + "\n" + gevondenReiziger + "\n" );
        }
    }

