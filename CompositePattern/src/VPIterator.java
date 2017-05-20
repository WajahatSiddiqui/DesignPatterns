import java.util.Iterator;


public class VPIterator implements Iterator<VP> {
    private VP mVp;

    public VPIterator(VP vp) {
        mVp = vp;
    }
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public VP next() {
        return mVp;
    }

    @Override
    public void remove() {
    }
}
