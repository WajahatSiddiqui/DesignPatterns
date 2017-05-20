
public interface AutomatInterface {
    public void gotApplication();

    public void checkApplication();

    public void rentApartment();

    public void setState(State s);

    public State getWaitingState();

    public State getGotApplicationState();

    public State getApartmentRentedState();

    public State getFullyRentedState();

    public int getCount();

    public void setCount(int n);
}
