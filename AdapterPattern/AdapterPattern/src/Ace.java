
public class Ace implements AceInterface {
    String mName;
    @Override
    public void setName(String name) {
        mName = name;
    }

    @Override
    public String getName() {
        return mName;
    }
}
