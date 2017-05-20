package StateWithObjects;

import java.util.Random;

public class GotApplicationState implements State {
    AutomatInterface mAutomat;
    Random mRandom;

    public GotApplicationState(AutomatInterface a) {
        mAutomat = a;
        mRandom = new Random(System.currentTimeMillis());
    }
    @Override
    public String gotApplication() {
        return "We already got your application";
    }

    @Override
    public String checkApplication() {
        int doAccept = mRandom.nextInt() % 10;
        if (doAccept > 4 && mAutomat.getCount() > 0) {
            mAutomat.setState(mAutomat.getApartmentRentedState());
            return "Congragulations, you were approved.";
        } else {
            mAutomat.setState(mAutomat.getWaitingState());
            return "Sorry, you were not approved.";
        }
    }

    @Override
    public String rentApartment() {
        return "You must have your application checked";
    }

    @Override
    public String dispenseKeys() {
        return "You must have your application checked";
    }
}
