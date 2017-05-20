import java.util.Vector;

public class Database implements Subject {
    private Vector<Observer> mObservers;
    private String mOperation;
    private String mRecord;

    public Database() {
        mObservers = new Vector<Observer>();
    }

    @Override
    public void register(Observer observer) {
        mObservers.add(observer);
    }

    @Override
    public void unregiser(Observer observer) {
        mObservers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : mObservers) {
            observer.update(mOperation, mRecord);
        }
    }

    public void editRecord(String operation, String record) {
        System.out.println("Database editRecord: operation: " + operation
                + " record: " + record);
        mOperation = operation;
        mRecord = record;
        notifyObserver();
    }
}
