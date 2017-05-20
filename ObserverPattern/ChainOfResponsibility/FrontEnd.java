
public class FrontEnd implements HelpInterface {
    HelpInterface mSuccessor;
    public static final int FRONT_END_HELP = 1;
    public FrontEnd(HelpInterface s) {
        mSuccessor = s;
    }
    @Override
    public void getHelp(int helpCount) {
        if (helpCount != FRONT_END_HELP) {
            mSuccessor.getHelp(helpCount);
        } else {
            System.out
                    .println("This is front end help - handled the request here");
        }
    }
}
