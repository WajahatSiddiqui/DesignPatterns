import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class AutomatServer implements AutomatInterface, Runnable {
    State mWaitingState;
    State mGotApplicationState;
    State mApartmentRentedState;
    State mFullyRentedState;
    State mState;
    int mCount;
    private Thread mThread;
    ServerSocket mServerSocket;
    PrintWriter mOut;
    Socket mConnectionSocket;

    public static void main(String args[]) {
        new AutomatServer();
        System.out.println("Starting Server");
    }

    public AutomatServer() {
        mCount = 9;
        mWaitingState = new WaitingState(this);
        mGotApplicationState = new GotApplicationState(this);
        mApartmentRentedState = new ApartmentRentedState(this);
        mState = mWaitingState;
        try {
            mServerSocket = new ServerSocket(9760);
            mConnectionSocket = mServerSocket.accept();
            mOut = new PrintWriter(mConnectionSocket.getOutputStream(), true);
            // Handle the incoming data from worker thread.
            mThread = new Thread(this);
            mThread.start();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    @Override
    public void run() {
        String incomingData;
        try {
            BufferedReader in =
                    new BufferedReader(new
                            InputStreamReader(mConnectionSocket
                                    .getInputStream()));
            while((incomingData = in.readLine()) != null) {
                if (incomingData.equals("gotApplication")) {
                    gotApplication();
                } else if (incomingData.equals("checkApplication")) {
                    checkApplication();
                } else if (incomingData.equals("rentApartment")) {
                    rentApartment();
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void gotApplication() {
        mOut.println(mState.gotApplication());
    }

    @Override
    public void checkApplication() {
        mOut.println(mState.checkApplication());
    }

    @Override
    public void rentApartment() {
        mOut.println(mState.rentApartment());
        mOut.println(mState.dispenseKeys());
    }

    @Override
    public void setState(State s) {
        mState = s;
    }

    @Override
    public State getWaitingState() {
        return mWaitingState;
    }

    @Override
    public State getGotApplicationState() {
        return mGotApplicationState;
    }

    @Override
    public State getApartmentRentedState() {
        return mApartmentRentedState;
    }

    @Override
    public State getFullyRentedState() {
        return mFullyRentedState;
    }

    @Override
    public int getCount() {
        return mCount;
    }

    @Override
    public void setCount(int n) {
        mCount = n;
    }
}
