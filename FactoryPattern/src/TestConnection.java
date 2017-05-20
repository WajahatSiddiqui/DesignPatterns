
public class TestConnection {
    public static void main(String[] args) {
        ConnectionFactory connectionFactory =
                new ConnectionFactory("SQLServer");
        Connection oracleConnection = connectionFactory.getConnection();
        System.out
                .println("Connected to db: " + oracleConnection.description());
    }
}
