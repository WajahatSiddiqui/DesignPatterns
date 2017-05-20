
public class TestMediator {
    public TestMediator() {
        Mediator m = new Mediator();
        m.getWelcome().go();
    }
    public static void main(String[] args) {
        new TestMediator();
    }
}
