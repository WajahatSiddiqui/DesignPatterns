import java.util.Iterator;

public class VP extends Corporate {
    private String mName;
    private String mDivision;

    public VP(String name, String division) {
        mName = name;
        mDivision = division;
    }

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public void add(Corporate c) {
    }

    @Override
    public void print() {
        System.out.println("Name: " + mName + " Division: " + mDivision);
    }

    @Override
    public Iterator iterator() {
        return new VPIterator(this);
    }
}
