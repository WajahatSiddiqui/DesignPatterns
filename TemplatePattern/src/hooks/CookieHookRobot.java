package hooks;

public class CookieHookRobot extends RobotHookTemplate {
    private String mName;

    public CookieHookRobot(String name) {
        mName = name;
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

    @Override
    public boolean testOK() {
        return false;
    }
}
