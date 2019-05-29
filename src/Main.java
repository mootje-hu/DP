import java.sql.*;


public class Main {
    private static final String DB_DRIV = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_URL = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";
    private static final String DB_USER = "MOOTJE";
    private static final String DB_PASS = "1234";
    private static Connection conn;

    // De methode die met JDBC aan de slag gaat moet een SQLException opvangen of gooien
    public static void main(String[] args) throws SQLException{
        //Besluit welke driver je gaat gebruiken voor je verbinding
        try {
            Class.forName(DB_DRIV).newInstance();
        }
        catch (InstantiationException | IllegalAccessException | ClassNotFoundException e1) {
            e1.printStackTrace();
        }

        // Leg de connectie met de database
        conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        //System.out.println("Connection made");

        // Een eerste SQL statement maken
        Statement stmt = conn.createStatement();
        String strQuery = "SELECT * FROM CURSUSSEN";

        // Een SQL statement uitvoeren
        System.out.println(stmt.executeUpdate(strQuery));

        // Iets doen met de resultaten


        stmt.close();
        conn.close();

    }
}

