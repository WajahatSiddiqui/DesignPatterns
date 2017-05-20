
public class TestAutomatProxy {
    AutomatProxy mAutomatProxy;
    public static void main(String[] args) {
        new TestAutomatProxy();
    }

    public TestAutomatProxy() {
        mAutomatProxy = new AutomatProxy();
        mAutomatProxy.gotApplication();
        mAutomatProxy.checkApplication();
        mAutomatProxy.rentApartment();
    }
}
