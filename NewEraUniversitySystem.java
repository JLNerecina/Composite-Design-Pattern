public class NewEraUniversitySystem {
    public static void main(String[] args) {
        // Create Students
        Student s1 = new Student("Alfredo Lim", "S101", 1500.0);
        Student s2 = new Student("Sam Andres", "S102", 1500.0);
        Student s3 = new Student("Carlo Delfin", "S103", 2000.0);
        Student s4 = new Student("Maria De Jesus", "S104", 2000.0);

        // Create Teachers
        Teacher t1 = new Teacher("Dr. Grace Dolor", "Algorithms", 5000.0);
        Teacher t2 = new Teacher("Dr. John Adam Balvuena", "Systems", 5200.0);
        Teacher t3 = new Teacher("Prof. Amanda Martinez", "Economics", 4800.0);

        // Create Departments and add Teachers/Students
        Department csDept = new Department("Department of Computer Science");
        csDept.add(t1);
        csDept.add(t2);
        csDept.add(s1);
        csDept.add(s2);

        Department financeDept = new Department("Department of Finance");
        financeDept.add(t3);
        financeDept.add(s3);
        financeDept.add(s4);

        // Create Colleges and add Departments/Individuals
        College engineeringCollege = new College("College of Engineering");
        engineeringCollege.add(csDept);
        Student independentStudent = new Student("Abdul Rahman", "S105", 1000.0);
        engineeringCollege.add(independentStudent); 

        College businessCollege = new College("College of Business");
        businessCollege.add(financeDept);

        // Create the main University using the new University class
        University newEraUniversity = new University("New Era University");
        newEraUniversity.add(engineeringCollege);
        newEraUniversity.add(businessCollege);

        // --- Demonstrating Functionality ---
        
        // Displaying the hierarchy (Will now say [University] instead of [College])
        newEraUniversity.displayDetails("");

        System.out.println("\n=== METRICS ===");
        System.out.println("Total Students in New Era University: " + newEraUniversity.getStudentCount());
        System.out.println("Total Budget for New Era University: $" + newEraUniversity.calculateBudget());

        System.out.println("\nTotal Students in College of Engineering: " + engineeringCollege.getStudentCount());
        System.out.println("Total Budget for College of Engineering: $" + engineeringCollege.calculateBudget());
    }
}