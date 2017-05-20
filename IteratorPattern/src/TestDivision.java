
public class TestDivision {
    Division division;
    DivisionIterator iterator;

    public TestDivision() {
        division = new Division("Sales");
        division.add("Ted");
        division.add("Bob");
        division.add("Carol");
        division.add("Alice");
        iterator = division.iterator();
        while (iterator.hasNext()) {
            VP vp = iterator.next();
            vp.print();
        }
    }
    public static void main(String[] args) {
        new TestDivision();
    }
}
