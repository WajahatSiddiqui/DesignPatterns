import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class AutomatProxy implements Runnable {
    private Thread mThread;
    Socket mSocket;
    InputStream mIn;
    PrintWriter mOut;
    int character;

    public AutomatProxy() {
        try {
            mSocket = new Socket("127.0.0.1", 9760);
            System.out.println("Connecting ...");
            mIn = mSocket.getInputStream();
            mOut = new PrintWriter(mSocket.getOutputStream(), true);
            mThread = new Thread(this);
            mThread.start();
        } catch (IOException ioe) {
            System.err
                    .println("The server must be running, not connected now error : "
                            + ioe.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        if (mSocket != null && mSocket.isConnected()) {
            System.out.println("Connected Successfully !!!");
        }
    }

    public void gotApplication() {
        mOut.println("gotApplication");
    }

    public void checkApplication() {
        mOut.println("checkApplication");
    }

    public void rentApartment() {
        mOut.println("rentApartment");
    }

    @Override
    public void run() {
        try {
            while ((character = mIn.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
