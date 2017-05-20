package StateWithObjects;

public class TestAutomat {
    Automat automat;

    public TestAutomat() {
        automat = new Automat(9);
        automat.gotApplication();
        automat.checkApplication();
        automat.rentApartment();
    }
    public static void main(String[] args) {
        new TestAutomat();
    }
}
