// If private constructor no body can create new
public class Database {
    private int mRecord;
    private String mName;
    private static Database sDatabase = null;

    private Database(String n) {
        mName = n;
        mRecord = 0;
    }

    public static Database getInstance(String n) {
        if (sDatabase == null) {
            sDatabase = new Database(n);
        }
        return sDatabase;
    }
    public String getName() {
        return mName;
    }
}
