
public class AsiaServer implements Receiver {
    @Override
    public void connect() {
        System.out.println("You're connected to Asia server");
    }

    @Override
    public void diagnostics() {
        System.out.println("The Asia server diagonostics check out OK");
    }

    @Override
    public void reboot() {
        System.out.println("Rebooting the Asia server");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutting down Asia server");
    }

    @Override
    public void disconnect() {
        System.out.println("You are disconnected from Asia server");
    }
}
