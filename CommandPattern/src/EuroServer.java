
public class EuroServer implements Receiver {
    @Override
    public void connect() {
        System.out.println("You're connected to Euro server");
    }

    @Override
    public void diagnostics() {
        System.out.println("The Euro server diagonostics check out OK");
    }

    @Override
    public void reboot() {
        System.out.println("Rebooting the Euro server");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutting down Euro server");
    }

    @Override
    public void disconnect() {
        System.out.println("You are disconnected from Euro server");
    }
}
