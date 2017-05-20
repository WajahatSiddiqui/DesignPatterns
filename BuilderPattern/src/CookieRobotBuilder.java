import java.util.ArrayList;


public class CookieRobotBuilder implements RobotBuilder {
    CookieRobotBuildable mRobot;
    ArrayList<Integer> mActions;

    public CookieRobotBuilder() {
        mRobot = new CookieRobotBuildable();
        mActions = new ArrayList<Integer>();
    }
    @Override
    public void addStart() {
        mActions.add(new Integer(1));
    }

    @Override
    public void addGetParts() {
        mActions.add(new Integer(2));
    }

    @Override
    public void addAssemble() {
        mActions.add(new Integer(3));
    }

    @Override
    public void addTest() {
        mActions.add(new Integer(4));
    }

    @Override
    public void addStop() {
        mActions.add(new Integer(5));
    }

    @Override
    public RobotBuildable getRobot() {
        mRobot.loadActions(mActions);
        return mRobot;
    }
}
