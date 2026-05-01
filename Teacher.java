public class Teacher implements EducationalUnit {
    private String name;
    private String subject;
    private double salary;

    public Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public int getStudentCount() {
        return 0; // Teachers don't add to the student count
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "Teacher: " + name + " | Subject: " + subject + " | Salary: $" + salary);
    }

    @Override
    public double calculateBudget() {
        return salary; // Teacher's budget is just their salary
    }
}