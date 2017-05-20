import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Purchase {
    Mediator mMediator;
    String response = "n";

    public Purchase(Mediator m) {
        mMediator = m;
    }

    public void go() {
        System.out.println("Buy the item now ? [y/n]");
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        try {
            response = reader.readLine();
        } catch (IOException e) {
            System.err.println("Error while reading");
        }
        if (response.equals("y")) {
            System.out.println("Thanks for shopping");
        } else {
            mMediator.handle("purchase.exit");
        }
    }
}
