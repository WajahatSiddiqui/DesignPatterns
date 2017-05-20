
public class TestSingleton {
    public static void main(String args[]) {
        Database database1 = Database.getInstance("Product");
        System.out.println("Database created: " + database1.getName());
        Database database2 = Database.getInstance("Employees");
        System.out.println("Database created: " + database2.getName());
    }
}
