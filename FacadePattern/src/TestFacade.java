
public class TestFacade {
    public TestFacade() {
        SimpleProductFacade simpleProductFacade =
                new SimpleProductFacade(new DifficultProduct());
        simpleProductFacade.setName("Printer");
        System.out.println("This product is: " + simpleProductFacade.getName());
    }

    public static void main(String args[]) {
        new TestFacade();
    }
}
