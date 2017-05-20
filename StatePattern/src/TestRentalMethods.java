
public class TestRentalMethods {
    RentalMethods rentalMethods;

    public TestRentalMethods() {
        // 9 Apartments to rent
        rentalMethods = new RentalMethods(9);
        rentalMethods.getApplication();
        rentalMethods.checkApplication();
    }

    public static void main(String args[]) {
        new TestRentalMethods();
    }
}
