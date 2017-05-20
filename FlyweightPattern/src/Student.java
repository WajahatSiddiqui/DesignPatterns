
public class Student {
    double mAvgScore;
    String mName;
    int mId;
    int mScore;

    public Student(double avgScore) {
        mAvgScore = avgScore;
    }

    public void setName(String name) {
        mName = name;
    }

    public void setId(int id) {
        mId = id;
    }

    public void setScore(int score) {
        mScore = score;
    }

    String getName() {
        return mName;
    }

    int getId() {
        return mId;
    }

    int getScore() {
        return mScore;
    }

    public double getStanding() {
        return (((mScore) / mAvgScore - 1) * 100.0);
    }
}
