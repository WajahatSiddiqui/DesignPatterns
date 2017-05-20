public interface Subject {
    public void register(Observer observer);
    public void unregiser(Observer observer);
    public void notifyObserver();
}
