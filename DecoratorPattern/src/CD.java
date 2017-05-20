
public class CD extends ComponentDecorator {
    Computer mComputer;

    public CD(Computer c) {
        mComputer = c;
    }

    @Override
    public String description() {
        return mComputer.description() + " and a CD";
    }
}
