package StateWithObjects;

public class Automat implements AutomatInterface {
    State mWaitingState;
    State mGotApplicationState;
    State mApartmentRentedState;
    State mFullyRentedState;
    State mState;
    int mCount;

    public Automat(int n) {
        mCount = n;
        mWaitingState = new WaitingState(this);
        mGotApplicationState = new GotApplicationState(this);
        mApartmentRentedState = new ApartmentRentedState(this);
        mState = mWaitingState; // Assign the current state
    }
    @Override
    public void gotApplication() {
        System.out.println(mState.gotApplication());
    }

    @Override
    public void checkApplication() {
        System.out.println(mState.checkApplication());
    }

    @Override
    public void rentApartment() {
        System.out.println(mState.rentApartment());
        System.out.println(mState.dispenseKeys());
    }

    @Override
    public int getCount() {
        return mCount;
    }

    @Override
    public void setCount(int n) {
        mCount = n;
    }

    @Override
    public void setState(State s) {
        mState = s;
    }

    @Override
    public State getWaitingState() {
        return mWaitingState;
    }

    @Override
    public State getGotApplicationState() {
        return mGotApplicationState;
    }

    @Override
    public State getApartmentRentedState() {
        return mApartmentRentedState;
    }

    @Override
    public State getFullyRentedState() {
        // TODO Auto-generated method stub
        return mFullyRentedState;
    }
}