public class Student {
    private String name;
    private int rollNumber;
    private int[] marks;
    private double GPA;

    public Student() {
    }

    public double calculateGPA() {
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        return (double) total / marks.length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getrollNumber() {
        return rollNumber;
    }

    public void setrollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double gPA) {
        GPA = gPA;
    }
}
