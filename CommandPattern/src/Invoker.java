
public class Invoker {
    Command mCommand;

    public void setCommand(Command c) {
        mCommand = c;
    }

    public void run() {
        mCommand.execute();
    }
}
