
public class USServer implements Receiver {
    @Override
    public void connect() {
        System.out.println("You're connected to US server");
    }

    @Override
    public void diagnostics() {
        System.out.println("The US server diagonostics check out OK");
    }

    @Override
    public void reboot() {
        System.out.println("Rebooting the US server");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutting down US server");
    }

    @Override
    public void disconnect() {
        System.out.println("You are disconnected from US server");
    }
}
