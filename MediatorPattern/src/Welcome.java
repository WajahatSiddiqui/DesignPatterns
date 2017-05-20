import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Welcome {
    Mediator mMediator;
    String response = "n";

    public Welcome(Mediator m) {
        mMediator = m;
    }

    public void go() {
        System.out.println("Do you want to shop ? [y/n]");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            response = reader.readLine();
        } catch (IOException e) {
            System.err.println("Error while reading");
        }
        if (response.equals("y")) {
            mMediator.handle("welcome.shop");
        } else {
            mMediator.handle("welcome.exit");
        }
    }
}
