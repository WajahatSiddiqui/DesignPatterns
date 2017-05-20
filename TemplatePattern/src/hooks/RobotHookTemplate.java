package hooks;

public abstract class RobotHookTemplate {
    public final void go() {
        start();
        getParts();
        assemble();
        if (testOK()) {
            test();
        }
        stop();
    }

    public void start() {
        System.out.println("Starting...");
    }

    public void getParts() {
        System.out.println("Getting parts...");
    }

    public void assemble() {
        System.out.println("Assembling...");
    }

    public void test() {
        System.out.println("Testing...");
    }

    public void stop() {
        System.out.println("Stopping...");
    }

    public boolean testOK() {
        return true;
    }
}
