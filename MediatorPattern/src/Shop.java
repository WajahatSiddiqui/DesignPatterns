import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shop {
    Mediator mMediator;
    String response = "n";

    public Shop(Mediator m) {
        mMediator = m;
    }

    public void go() {
        System.out.println("Do you want to purchase ? [y/n]");
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        try {
            response = reader.readLine();
        } catch (IOException e) {
            System.err.println("Error while reading");
        }
        if (response.equals("y")) {
            mMediator.handle("shop.purchase");
        } else {
            mMediator.handle("shop.exit");
        }
    }
}
