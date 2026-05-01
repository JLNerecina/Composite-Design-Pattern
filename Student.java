public class Student implements EducationalUnit {
    private String name;
    private String studentId;
    private double tuitionFee;

    public Student(String name, String studentId, double tuitionFee) {
        this.name = name;
        this.studentId = studentId;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public int getStudentCount() {
        return 1; // Each student counts as 1
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "Student: " + name + " | ID: " + studentId + " | Tuition: $" + tuitionFee);
    }

    @Override
    public double calculateBudget() {
        return -tuitionFee; // Student's budget contribution is negative (income for the school)
    }
}