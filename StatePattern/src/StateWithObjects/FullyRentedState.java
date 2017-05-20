package StateWithObjects;

public class FullyRentedState implements State {
    AutomatInterface mAutomat;

    public FullyRentedState(AutomatInterface a) {
        mAutomat = a;
    }
    @Override
    public String gotApplication() {
        return "Sorry, we're fully rented";
    }

    @Override
    public String checkApplication() {
        return "Sorry, we're fully rented";
    }

    @Override
    public String rentApartment() {
        return "Sorry, we're fully rented";
    }

    @Override
    public String dispenseKeys() {
        return "Sorry, we're fully rented";
    }
}
