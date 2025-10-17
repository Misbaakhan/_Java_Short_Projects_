import java.io.*;
import java.util.*;

public class StudentManager {
    private static final String FILE_NAME = "students.txt";
    private Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        Student student = new Student();

        System.out.print("Enter student name: ");
        student.setName(scanner.nextLine());

        System.out.print("Enter roll number: ");
        student.setrollNumber(scanner.nextInt());

        
        int numSubjects = 3; 
        int[] marks = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        student.setMarks(marks);
        scanner.nextLine(); 

        
        student.setGPA(student.calculateGPA());

       
        saveStudentToFile(student);
        System.out.println("Student added successfully!");
    }

    private void saveStudentToFile(Student student) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            StringBuilder sb = new StringBuilder();
            sb.append(student.getrollNumber()).append(",");
            sb.append(student.getName()).append(",");
            for (int m : student.getMarks()) {
                sb.append(m).append(",");
            }
            sb.append(student.getGPA());
            bw.write(sb.toString());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public void viewAllStudents() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("RollNo | Name | Marks | GPA");
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                System.out.print(parts[0] + " | " + parts[1] + " | ");
                for (int i = 2; i < parts.length - 1; i++) {
                    System.out.print(parts[i] + " ");
                }
                System.out.println("| " + parts[parts.length - 1]);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        StudentManager sm = new StudentManager();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Student\n2. View All Students\n3. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1 -> sm.addStudent();
                case 2 -> sm.viewAllStudents();
                case 3 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option!");
            }
        }
    }
}
