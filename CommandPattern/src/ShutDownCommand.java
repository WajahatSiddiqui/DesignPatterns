
public class ShutDownCommand implements Command {
    private Receiver mReceiver;

    public ShutDownCommand(Receiver r) {
        mReceiver = r;
    }
    @Override
    public void execute() {
        mReceiver.connect();
        mReceiver.shutdown();
        mReceiver.disconnect();
        System.out.println();
    }
}
