
public class TestHelp {
    private static final int GENERAL_HELP = 3;

    public static void main(String args[]) {
        Application app = new Application();
        IntermediateLayer intermediateLayer = new IntermediateLayer(app);
        FrontEnd frontEnd = new FrontEnd(intermediateLayer);
        frontEnd.getHelp(GENERAL_HELP);
    }
}
