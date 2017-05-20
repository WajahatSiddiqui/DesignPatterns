
public class IntermediateLayer implements HelpInterface {
    public static final int INTERMEDIATE_LAYER_HELP = 2;
    HelpInterface mSuccessor;

    public IntermediateLayer(HelpInterface s) {
        mSuccessor = s;
    }
    @Override
    public void getHelp(int helpCount) {
        if (helpCount != INTERMEDIATE_LAYER_HELP) {
            mSuccessor.getHelp(helpCount);
        } else {
            System.out.println("This is IntermediateLayer help - request is processed");
        }
    }
}
