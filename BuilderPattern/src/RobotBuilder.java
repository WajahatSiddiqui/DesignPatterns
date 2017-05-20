
public interface RobotBuilder {
    public void addStart();

    public void addGetParts();

    public void addAssemble();

    public void addTest();

    public void addStop();

    public RobotBuildable getRobot();
}
