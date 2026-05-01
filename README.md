# Composite Design Pattern - New Era University System

## Overview

This Java project implements a university organizational model using the Composite Design Pattern. It represents the hierarchical structure of New Era University, where educational units can be either leaf entities or compositions of other units.

The system models:
- `University`: the top-level container for colleges
- `College`: a high-level organizational unit that can contain departments, teachers, students, and sub-colleges
- `Department`: a subdivision within a college that can contain teachers and students
- `Teacher`: an individual entity with a name, subject, and salary
- `Student`: an individual entity with a name, student ID, and tuition fee

## Requirements Covered

The project meets the following requirements:

- Model the hierarchical "part-whole" relationship using the Composite Pattern.
- Calculate the number of students for any educational unit.
- Display details of any educational unit in a clear hierarchical format.
- Calculate the budget for colleges and departments using the defined budget rules.

## Budget Rules

- `Teacher` budget = salary
- `Student` budget = -tuition fee
- `Department` budget = sum of its children budgets
- `College` budget = sum of its children budgets
- `University` budget = sum of its children budgets

## Classes and Structure

### `EducationalUnit` (interface)
Defines the component interface for the composite structure:
- `int getStudentCount()`
- `void displayDetails(String indent)`
- `double calculateBudget()`

### Composite classes
- `University`: can contain `EducationalUnit` children, such as colleges
- `College`: can contain departments, teachers, students, and other colleges
- `Department`: can contain teachers and students

### Leaf classes
- `Teacher`: no children, represents an individual instructor
- `Student`: no children, represents an individual learner

## UML Class Diagram

![Composite Pattern UML Diagram](https://github.com/JLNerecina/Composite-Design-Pattern/blob/main/Composite%20Design%20Pattern%20UML.png)

## How to Run

From the project root directory, compile and run the example client:

```bash
javac *.java
java NewEraUniversitySystem
```

## Demonstrated Functionality

The `NewEraUniversitySystem` client demonstrates:
- creating teachers, students, departments, and colleges
- assembling a university hierarchy
- displaying the full structure
- calculating the total number of students in a college or university
- calculating the total budget for a college or university

## Example Output

The sample client prints the university hierarchy, then displays:
- total students in `New Era University`
- total budget for `New Era University`
- total students and budget for `College of Engineering`

## Notes

- The project uses plain Java and does not require external libraries.
- The design follows the Composite Design Pattern, allowing clients to treat individual objects and compositions uniformly.
