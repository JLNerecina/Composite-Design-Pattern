# 🏛️ Composite Design Pattern: New Era University System

## 🎯 Overview

This repository demonstrates the **Composite Design Pattern** through a university organizational model. By representing the hierarchical structure of **New Era University**, the system treats individual entities (like Teachers and Students) and composed units (like Departments and Colleges) uniformly.

The project effectively models the "part-whole" relationship where a high-level container can perform operations on its children recursively without knowing their specific types.

---

## 🛠️ System Architecture

The system is built on a recursive tree structure. Every component implements the `EducationalUnit` interface, allowing the "leaf" nodes and "composite" nodes to be processed via the same API.

### Component Breakdown

| Entity | Type | Description |
| --- | --- | --- |
| **University** | Composite | The top-level root; contains Colleges. |
| **College** | Composite | High-level unit; can contain Departments, Teachers, or Students. |
| **Department** | Composite | Subdivision; contains specialized Teachers and Students. |
| **Teacher** | Leaf | Individual entity with a salary. |
| **Student** | Leaf | Individual entity with a tuition fee. |

---

## 💰 Budgetary Logic

The system calculates financial health using a recursive budget function. We treat salaries as outflows and tuition as inflows.

For any **Leaf** node:

* **Teacher:** $Budget = Salary$
* **Student:** $Budget = -Tuition\_Fee$

For any **Composite** node (Department, College, or University), the budget is defined as the sum of all its children's budgets:

$$Budget_{Total} = \sum_{i=1}^{n} Budget(Unit_i)$$

---

## 🚀 Getting Started

### Prerequisites

* Java Development Kit (JDK) 8 or higher.

### Compilation & Execution

Navigate to the project root and run the following commands:

```bash
# Compile all source files
javac *.java

# Run the main entry point
java NewEraUniversitySystem

```

---

## 📊 UML Class Diagram

The following diagram illustrates the relationship between the `EducationalUnit` interface and its various implementations.

---

## ✨ Key Features Demonstrated

* **Hierarchical Scaling:** Easily add new layers (e.g., "Research Lab") without changing existing client code.
* **Uniform Operations:** Calculate the total student count or budget for the entire University or a single Department using the exact same method call.
* **Recursive Visualization:** The `displayDetails` method uses an indentation logic to print the tree structure to the console.

> [!TIP]
> **Why Composite?** > Notice how `NewEraUniversitySystem.java` doesn't care if it's talking to a single `Teacher` or an entire `College`. It just calls `.calculateBudget()` and let the recursion handle the heavy lifting.

---

## 📝 Example Output

Upon execution, the system will output a tree-like structure similar to this:

```text
[University] New Era University
  [College] College of Engineering
    [Department] Computer Science
      - Teacher: Dr. Smith | Salary: 5000.0
      - Student: Alice | ID: 101 | Fee: 2000.0
...
Total Students in University: 150
Total Budget for College of Engineering: $12,500.00

```

