
public class TestCorporation {
    Corporation mCorporation;

    public TestCorporation() {
        mCorporation = new Corporation();
        Division rnd = new Division("R&D");
        rnd.add(new VP("Steve", "R&D"));
        rnd.add(new VP("Mike", "R&D"));
        rnd.add(new VP("Nancy", "R&D"));
        Division sales = new Division("Sales");
        sales.add(new VP("Ted", "Sales"));
        sales.add(new VP("Bod", "Sales"));
        sales.add(new VP("Carol", "Sales"));
        sales.add(new VP("Alice", "Sales"));
        Division western = new Division("Western Sales");
        western.add(new VP("Wally", "Western Sales"));
        western.add(new VP("Andre", "Western Sales"));
        western.add(new VP("Ellore", "Western Sales"));
        sales.add(western);
        VP vp = new VP("Cary", "At Large");
        mCorporation.add(rnd);
        mCorporation.add(sales);
        mCorporation.add(vp);
        mCorporation.print();
    }
    public static void main(String[] args) {
        new TestCorporation();
    }
}
