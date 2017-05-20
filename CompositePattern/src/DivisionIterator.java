import java.util.Iterator;


public class DivisionIterator implements Iterator<Corporate> {
    private Corporate[] mCorporates;
    private int location = 0;

    public DivisionIterator(Corporate[] c) {
        mCorporates = c;
    }

    @Override
    public boolean hasNext() {
        if (location < mCorporates.length && mCorporates[location] != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Corporate next() {
        return mCorporates[location++];
    }

    @Override
    public void remove() {
    }
}
