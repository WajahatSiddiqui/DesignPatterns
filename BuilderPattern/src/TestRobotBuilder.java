import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestRobotBuilder {
    public static void main(String[] args) {
        RobotBuilder builder = null;
        String response = "a";
        System.out
                .println("Do you want a cookie robot [c] or automotive robot [a] ?");
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        try {
            response = reader.readLine();
        } catch (IOException e) {
            System.err.println("Error " + e.getMessage());
        }
        if (response.equals("c")) {
            builder = new CookieRobotBuilder();
        } else {
            // Automotive robot builder
        }
        // Start Constructing the Robot
        builder.addStart();
        builder.addTest();
        builder.addAssemble();
        builder.addStop();
        // Execute the robot
        builder.getRobot().go();
    }
}
