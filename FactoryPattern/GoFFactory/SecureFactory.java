
public class SecureFactory extends CFactory {
    @Override
    public Connection createConnection(String type) {
        if (type.equals("Oracle")) {
            return new SecureOracleConnection();
        } else if (type.equals("SQLServer")) {
            return new SecureSQLServerConnection();
        } else {
            return new SecureMySQLConnection();
        }
    }
}
