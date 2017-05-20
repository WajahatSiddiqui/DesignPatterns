
public class ConnectionFactory {
    String mConnectionType;

    public ConnectionFactory(String type) {
        mConnectionType = type;
    }

    public Connection getConnection() {
        if (mConnectionType.equals("Oracle")) {
            return new OracleConnection();
        } else if (mConnectionType.equals("SQLServer")) {
            return new SQLServerConnetion();
        } else {
            return new MySQLConnection();
        }
    }
}
