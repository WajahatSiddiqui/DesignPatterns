
public class RunDiagnosticsCommand implements Command {
    Receiver mReceiver;

    public RunDiagnosticsCommand(Receiver receiver) {
        mReceiver = receiver;
    }
    @Override
    public void execute() {
        mReceiver.connect();
        mReceiver.diagnostics();
        mReceiver.disconnect();
        System.out.println();
    }
}
