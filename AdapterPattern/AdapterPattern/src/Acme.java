
public class Acme implements AcmeInterface {
    String mFirstName;
    String mLastName;
    @Override
    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    @Override
    public String getFirstName() {
        return mFirstName;
    }

    @Override
    public String getLastName() {
        return mLastName;
    }
}
