package StateWithObjects;

public class WaitingState implements State {
    AutomatInterface mAutomat;

    public WaitingState(AutomatInterface a) {
        mAutomat = a;
    }
    @Override
    public String gotApplication() {
        mAutomat.setState(mAutomat.getGotApplicationState());
        return "Thanks for the application";
    }

    @Override
    public String checkApplication() {
        return "You have to submit an application.";
    }

    @Override
    public String rentApartment() {
        return "You have to submit an application";
    }

    @Override
    public String dispenseKeys() {
        return "You have to submit an application.";
    }
}
