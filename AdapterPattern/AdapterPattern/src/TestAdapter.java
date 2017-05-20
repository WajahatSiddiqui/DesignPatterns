
public class TestAdapter {
    public static void main(String[] args) {
        Ace ace = new Ace();
        ace.setName("Wajahat Siddiqui");
        AceToAcmeAdapter adapter = new AceToAcmeAdapter(ace);
        System.out.println("First Name: " + adapter.getFirstName());
        System.out.println("Last Name: " + adapter.getLastName());
    }
}
