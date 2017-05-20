import java.util.Random;

public class RentalMethods {
    public enum RentalStates {
        FULLY_RENTED, WAITING, GOT_APPLICATION, APARTMENT_RENTED
    }

    RentalStates mState = RentalStates.WAITING;
    // Used for determining if a customer is accepted/rejected.
    Random mRandom;
    int mNumberApartments;

    public RentalMethods(int n) {
        mNumberApartments = n;
        mRandom = new Random(System.currentTimeMillis());
    }

    public void getApplication() {
        switch (mState) {
        case FULLY_RENTED:
            System.out.println("Sorry, we're fully rented.");
            break;
        case WAITING:
            System.out.println("Thanks for the application!");
            mState = RentalStates.GOT_APPLICATION;
            break;
        case GOT_APPLICATION:
            System.out.println("We already got your application");
            break;
        case APARTMENT_RENTED:
            System.out.println("Hangon we're renting you an apartment");
            break;
        }
    }

    public void checkApplication() {
        int doAccept = mRandom.nextInt() % 10;
        switch (mState) {
        case FULLY_RENTED:
            System.out.println("Sorry, we're fully rented.");
            break;
        case WAITING:
            System.out.println("You have to submit the application");
            break;
        case GOT_APPLICATION:
            if (doAccept > 4 && mNumberApartments > 0) {
                System.out.println("Congragulations, you were approved.");
                mState = RentalStates.APARTMENT_RENTED;
                rentApartment();
            } else {
                System.out.println("Sorry, you were not approved.");
                mState = RentalStates.WAITING;
            }
            break;
        case APARTMENT_RENTED:
            System.out.println("Hangon, we're renting you apartment!");
            break;
        }
    }

    public void rentApartment() {
        switch (mState) {
        case FULLY_RENTED:
            System.out.println("Sorry, we're fully rented.");
            break;
        case WAITING:
            System.out.println("You have to submit the application");
            break;
        case GOT_APPLICATION:
            System.out.println("You must have your application");
            break;
        case APARTMENT_RENTED:
            System.out.println("Renting you an apartment ...");
            mNumberApartments--;
            dispenseKeys();
            break;
        }
    }

    public void dispenseKeys() {
        switch (mState) {
        case FULLY_RENTED:
            System.out.println("Sorry, we're fully rented.");
            break;
        case WAITING:
            System.out.println("You have to submit the application");
            break;
        case GOT_APPLICATION:
            System.out.println("You must have your application");
            break;
        case APARTMENT_RENTED:
            System.out.println("Here are yours keys");
            mState = RentalStates.WAITING;
            break;
        }
    }
}
