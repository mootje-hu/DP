package P2;

import java.sql.Date;
import java.sql.SQLException;
import java.util.*;

public interface ReizigerDAO {
	ArrayList<Reiziger> findAll() throws SQLException;
	ArrayList<Reiziger> findByGBdatum(Date date) throws SQLException;
	Reiziger save(Reiziger r) throws SQLException;
	Reiziger update(Reiziger r) throws SQLException;
	boolean delete(Reiziger r) throws SQLException;
}
