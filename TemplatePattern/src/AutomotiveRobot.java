
public class AutomotiveRobot extends RobotTemplate {
    private String mName;

    public AutomotiveRobot(String name) {
        mName = name;
    }
    @Override
    public void getParts() {
        System.out.println("Getting a carburetor...");
    }

    @Override
    public void assemble() {
        System.out.println("Installing the carburetor...");
    }

    @Override
    public void test() {
        System.out.println("Revving the engine...");
    }

    public String getName() {
        return mName;
    }
}
