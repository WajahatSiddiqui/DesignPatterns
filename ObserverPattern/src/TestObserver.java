
public class TestObserver {
    public static void main(String args[]) {
        Database database = new Database();
        Archiver archiver = new Archiver();
        Client client = new Client();
        Boss boss = new Boss();
        database.register(archiver);
        database.register(client);
        database.register(boss);
        database.editRecord("Edit", "record1");
        database.unregiser(boss);
        database.editRecord("delete", "record1");
    }
}
