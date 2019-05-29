package P2;



import java.sql.*;
import java.sql.Date;
import java.util.*;


public class Main {

	public static void main(String[] args) throws SQLException {
		ReizigerOracleDAOImpl rdao = new ReizigerOracleDAOImpl();
		OVChipkaartOracleDAOImpl ovdao = new OVChipkaartOracleDAOImpl();

		printAllOVChipkaarten(ovdao);
		printAllReizigers(rdao);

		Reiziger Mohamed = new Reiziger(19, "MO", " ", "Hussen",  Date.valueOf("1999-12-24"));
		OVChipkaart mohamedovkaart = new OVChipkaart(12345, Date.valueOf("2022-01-01"), 2, (float) 99.99, Mohamed);
		OVChipkaart mohamedovkaart2 = new OVChipkaart(54321, Date.valueOf("2023-01-02"), 1, (float) 52.85, Mohamed);
		Mohamed.voegOvchipkaartToe(mohamedovkaart);
		Mohamed.voegOvchipkaartToe(mohamedovkaart2);
		rdao.save(Mohamed);
		printAllReizigers(rdao);

		mohamedovkaart.setSaldo((float) 95.99);
		ovdao.update(mohamedovkaart);

		ovdao.delete(mohamedovkaart2);


		String gbdatum = "1999-12-24";
		ArrayList<Reiziger> rList = rdao.findByGBdatum(Date.valueOf(gbdatum));
		System.out.println("Reizigers met geboortedatum " + gbdatum + ": ");
		for (Reiziger r : rList) {
			System.out.println(r);
		}
		System.out.println();

		rdao.delete(Mohamed);
		printAllReizigers(rdao);

		rdao.closeConnection();
	}

	public static void printAllOVChipkaarten(OVChipkaartDAO ovdao) throws SQLException {
		ArrayList<OVChipkaart> rList = ovdao.findAll();

		for (OVChipkaart k : rList) {
			System.out.println(k);
		}
		System.out.println();
	}

	public static void printAllReizigers(ReizigerDAO rDAO) throws SQLException {
		ArrayList<Reiziger> rList = rDAO.findAll();

		for (Reiziger r : rList) {
			System.out.println(r);
		}
		System.out.println();
	}
}
