// Check only one Student object is created but
// information is many which is handled like flyweight
public class TestFlyWeight {
    public static void main(String args[]) {
        String names[] = { "Tom", "Rob", "Blaze" };
        int ids[] = {1001, 1002, 1003};
        int scores[] = {35, 90, 70};
        double totalScore = 0;
        int numberOfStudents = ids.length;
        for (int i = 0; i < numberOfStudents; i++) {
            totalScore += scores[i];
        }
        double averageScore = totalScore/numberOfStudents;
        Student student = new Student(averageScore);
        for (int i = 0; i < numberOfStudents; i++) {
            student.setId(ids[i]);
            student.setName(names[i]);
            student.setScore(scores[i]);

            System.out.println("Name: "+student.getName());
            System.out.println("Standing: "+Math.round(student.getStanding()));
            System.out.println("");
        }
    }
}
