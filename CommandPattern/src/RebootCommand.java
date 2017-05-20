
public class RebootCommand implements Command {
    Receiver mReceiver;

    public RebootCommand(Receiver receiver) {
        mReceiver = receiver;
    }
    @Override
    public void execute() {
        mReceiver.connect();
        mReceiver.reboot();
        mReceiver.disconnect();
        System.out.println();
    }
}
