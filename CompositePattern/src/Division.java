import java.util.Iterator;



public class Division extends Corporate {
    private String mName;
    private Corporate[] mCorporate = new Corporate[100];
    private int mNumber = 0;
    public Division(String name) {
        mName = name;
    }

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public void add(Corporate c) {
        mCorporate[mNumber++] = c;
    }

    @Override
    public void print() {
        Iterator<Corporate> iterator = iterator();
        while (iterator.hasNext()) {
            Corporate c = iterator.next();
            c.print();
        }
    }

    @Override
    public Iterator<Corporate> iterator() {
        return new DivisionIterator(mCorporate);
    }
}
