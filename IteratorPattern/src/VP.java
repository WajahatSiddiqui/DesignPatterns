
public class VP {
    private String mName;
    private String mDivision;

    public VP(String name, String division) {
        mName = name;
        mDivision = division;
    }

    public String getName() {
        return mName;
    }

    public void print() {
        System.out.println("Name: " + mName + " Division: " + mDivision);
    }
}
