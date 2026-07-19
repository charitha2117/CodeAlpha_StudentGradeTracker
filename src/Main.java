import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice;

        do {

            System.out.println("\n========================================");
            System.out.println("       STUDENT GRADE TRACKER");
            System.out.println("========================================");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Show Statistics");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Enter a number.");
                scanner.next();
                System.out.print("Enter your choice: ");
            }

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();

                    int marks;

                    while (true) {

                        System.out.print("Enter Marks (0-100): ");

                        if (scanner.hasNextInt()) {

                            marks = scanner.nextInt();

                            if (marks >= 0 && marks <= 100)
                                break;

                            System.out.println("Marks should be between 0 and 100.");

                        } else {

                            System.out.println("Please enter a valid number.");
                            scanner.next();
                        }
                    }

                    manager.addStudent(id, name, marks);
                    break;

                case 2:

                    manager.viewStudents();
                    break;

                case 3:

                    System.out.print("Enter Student Name to Search: ");
                    String searchName = scanner.nextLine();
                    manager.searchStudent(searchName);
                    break;

                case 4:

                    System.out.print("Enter Student Name to Delete: ");
                    String deleteName = scanner.nextLine();
                    manager.deleteStudent(deleteName);
                    break;

                case 5:

                    manager.showStatistics();
                    break;

                case 6:

                    System.out.println("Thank you for using Student Grade Tracker.");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        scanner.close();
    }
}