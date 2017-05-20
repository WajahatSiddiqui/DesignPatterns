
public class Division {
    private String mName;
    private VP[] mVPs = new VP[100];
    private int number = 0;

    public Division(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public void add(String n) {
        VP vp = new VP(n, mName);
        mVPs[number++] = vp;
    }

    public DivisionIterator iterator() {
        return new DivisionIterator(mVPs);
    }
}
