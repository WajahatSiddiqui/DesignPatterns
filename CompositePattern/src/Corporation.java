import java.util.ArrayList;
import java.util.Iterator;


public class Corporation extends Corporate {
    private ArrayList<Corporate> corporateList = new ArrayList<Corporate>();

    public Corporation() {
    }

    @Override
    public void add(Corporate c) {
        corporateList.add(c);
    }

    @Override
    public void print() {
        Iterator<Corporate> iterator = corporateList.iterator();
        while (iterator.hasNext()) {
            Corporate c = iterator.next();
            c.print();
        }
    }
}
