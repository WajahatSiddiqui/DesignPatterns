
public abstract class CFactory {
    public CFactory() {
    }

    protected abstract Connection createConnection(String type);
}
