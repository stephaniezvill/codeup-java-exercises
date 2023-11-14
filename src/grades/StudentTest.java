package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Katherine");
        Student student2 = new Student("Carolina");

        student1.addGrade(85);
        student1.addGrade(90);
        student1.addGrade(95);

        student2.addGrade(88);
        student2.addGrade(92);
        student2.addGrade(98);

        System.out.println("Student 1 name: " + student1.getName());
        System.out.println("Student 1 average: " + student1.getGradeAverage());

        System.out.println("Student 2 name: " + student2.getName());
        System.out.println("Student 2 average: " + student2.getGradeAverage());
    }
}
