package grades;

import java.util.ArrayList;
//domain object is what student class is
public class Student {
    //can only be accessed within the Student class
    //this ArrayList will hold the students grades
    private String name;

    private ArrayList<Integer> grades;
    //constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }
    //getter
    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }

}

