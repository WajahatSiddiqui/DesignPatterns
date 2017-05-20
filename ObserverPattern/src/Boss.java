
public class Boss implements Observer {
    @Override
    public void update(String operation, String record) {
        System.out.println("The Boss says : Operation: " + operation
                + " was performed on record: " + record);
    }
}
