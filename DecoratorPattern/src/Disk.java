
public class Disk extends ComponentDecorator {
    Computer mComputer;

    public Disk(Computer c) {
        mComputer = c;
    }

    @Override
    public String description() {
        return mComputer.description() + " and a disk";
    }
}
