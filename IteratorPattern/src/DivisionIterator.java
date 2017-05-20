import java.util.Iterator;


public class DivisionIterator implements Iterator<VP> {
    private VP[] mVPs;
    private int location = 0;

    public DivisionIterator(VP[] v) {
        mVPs = v;
    }

    @Override
    public boolean hasNext() {
        if (location < mVPs.length && mVPs[location] != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public VP next() {
        return mVPs[location++];
    }

    @Override
    public void remove() {
    }
}
