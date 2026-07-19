public class Student {

    private int id;
    private String name;
    private int marks;
    private String grade;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.grade = calculateGrade();
    }

    private String calculateGrade() {
        if (marks >= 90)
            return "A";
        else if (marks >= 80)
            return "B";
        else if (marks >= 70)
            return "C";
        else if (marks >= 60)
            return "D";
        else
            return "F";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "ID : " + id +
                "\nName : " + name +
                "\nMarks : " + marks +
                "\nGrade : " + grade +
                "\n----------------------------";
    }
}