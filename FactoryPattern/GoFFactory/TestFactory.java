
public class TestFactory {
    public static void main(String argsp[]) {
        SecureFactory secureFactory = new SecureFactory();
        Connection connection = secureFactory.createConnection("Oracle");
        System.out.println("Connected to db: " + connection.description());
    }
}
