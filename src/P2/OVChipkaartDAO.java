package P2;

import java.util.ArrayList;


public interface OVChipkaartDAO {
	ArrayList<OVChipkaart> findAll();
	ArrayList<OVChipkaart> findByReiziger(Reiziger r);
	OVChipkaart save(OVChipkaart k);
	OVChipkaart update(OVChipkaart r);
	boolean delete(OVChipkaart r);
}
