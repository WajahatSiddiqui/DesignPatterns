
public class CookieRobot extends RobotTemplate {
    private String mName;

    public CookieRobot(String name) {
        mName = name;
    }

    @Override
    public void start() {
        System.out.println("Starting...");
    }

    @Override
    public void getParts() {
        System.out.println("Getting flour and sugar...");
    }

    @Override
    public void assemble() {
        System.out.println("Baking a cookie...");
    }

    @Override
    public void test() {
        System.out.println("Crunching a cookie...");
    }

    public String getName() {
        return mName;
    }
}
