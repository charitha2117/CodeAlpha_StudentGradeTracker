import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(int id, String name, int marks) {

        students.add(new Student(id, name, marks));
        System.out.println("\nStudent added successfully!");
    }

    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("\nNo student records found.");
            return;
        }

        System.out.println("\n========== STUDENT LIST ==========");

        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void searchStudent(String name) {

        for (Student student : students) {

            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println("\nStudent Found");
                System.out.println(student);
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public void deleteStudent(String name) {

        for (Student student : students) {

            if (student.getName().equalsIgnoreCase(name)) {
                students.remove(student);
                System.out.println("Student deleted successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public void showStatistics() {

        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        int total = students.size();
        int sum = 0;
        int highest = students.get(0).getMarks();
        int lowest = students.get(0).getMarks();

        for (Student student : students) {

            int marks = student.getMarks();
            sum += marks;

            if (marks > highest)
                highest = marks;

            if (marks < lowest)
                lowest = marks;
        }

        double average = (double) sum / total;

        System.out.println("\n========== STUDENT STATISTICS ==========");
        System.out.printf("Total Students : %d%n", total);
        System.out.printf("Average Marks  : %.2f%n", average);
        System.out.printf("Highest Marks  : %d%n", highest);
        System.out.printf("Lowest Marks   : %d%n", lowest);
        System.out.println("========================================");
    }
}