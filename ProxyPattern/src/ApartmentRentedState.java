

public class ApartmentRentedState implements State {
    AutomatInterface mAutomat;

    public ApartmentRentedState(AutomatInterface a) {
        mAutomat = a;
    }
    @Override
    public String gotApplication() {
        return "Hang on, we're renting you an apartment";
    }

    @Override
    public String checkApplication() {
        return "Hang on, we're renting you an apartment";
    }

    @Override
    public String rentApartment() {
        mAutomat.setCount(mAutomat.getCount() - 1);
        return "Renting you an apartment";
    }

    @Override
    public String dispenseKeys() {
        if (mAutomat.getCount() <= 0) {
            mAutomat.setState(mAutomat.getFullyRentedState());
        } else {
            mAutomat.setState(mAutomat.getWaitingState());
        }
        return "Here are your keys!";
    }
}
