
public class Client implements Observer {
    @Override
    public void update(String operation, String record) {
        System.out.println("The Client says : Operation: " + operation
                + " was performed on record: " + record);
    }
}
