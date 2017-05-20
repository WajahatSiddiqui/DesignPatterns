
public class Monitor extends ComponentDecorator {
    Computer mComputer;

    public Monitor(Computer c) {
        mComputer = c;
    }

    @Override
    public String description() {
        return mComputer.description() + " and a Monitor";
    }
}
