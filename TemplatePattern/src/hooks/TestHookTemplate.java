package hooks;

public class TestHookTemplate {
    public static void main(String args[]) {
        CookieHookRobot cookieHookRobot =
                new CookieHookRobot("CookieHookRobot");
        System.out.println(cookieHookRobot.getName() + ":");
        cookieHookRobot.go();
    }
}
