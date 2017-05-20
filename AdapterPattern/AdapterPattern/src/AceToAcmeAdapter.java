
public class AceToAcmeAdapter implements AcmeInterface {
    Ace mAce;
    String mFirstName;
    String mLastName;

    public AceToAcmeAdapter(Ace ace) {
        mAce = ace;
        mFirstName = mAce.getName().split(" ")[0];
        mLastName = mAce.getName().split(" ")[1];
    }
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
