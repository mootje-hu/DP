package P3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleBaseDAO {
    private static final String DB_DRIV = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
    private static final String DB_USER = "OVCHIPKAART";
    private static final String DB_PASS = "1234";

    protected static Connection conn;

    public OracleBaseDAO() throws SQLException {
        conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }

    protected static Connection getConnection() {
        return conn;
    }

    public static void closeConnection() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }
}
