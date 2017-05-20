
public abstract class Vehicle {
    private GoAlgorithm mGoAlgorithm;

    public Vehicle() {
    }

    public void setAlgorithm(GoAlgorithm goAlgorithm) {
        mGoAlgorithm = goAlgorithm;
    }

    public void go() {
        mGoAlgorithm.go();
    }
}
