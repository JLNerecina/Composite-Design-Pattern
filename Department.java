import java.util.ArrayList;
import java.util.List;

public class Department implements EducationalUnit {
    private String name;
    private List<EducationalUnit> units = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void add(EducationalUnit unit) {
        units.add(unit);
    }

    public void remove(EducationalUnit unit) {
        units.remove(unit);
    }

    @Override
    public int getStudentCount() {
        int totalStudents = 0;
        for (EducationalUnit unit : units) {
            totalStudents += unit.getStudentCount();
        }
        return totalStudents;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "[Department] " + name);
        for (EducationalUnit unit : units) {
            unit.displayDetails(indent + "    ");
        }
    }

    @Override
    public double calculateBudget() {
        double totalBudget = 0;
        for (EducationalUnit unit : units) {
            totalBudget += unit.calculateBudget();
        }
        return totalBudget;
    }
}