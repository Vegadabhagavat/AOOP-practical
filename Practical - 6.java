public class Employee {

    public int employeeID;
    public String employeeName;

    public Employee(String employeeName, int employeeID) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Rahul", 31);
        Employee emp2 = new Employee("Anjali", 32);
        Employee emp3 = new Employee("Sandeep", 33);

        System.out.println("Employee 1: " + emp1.employeeName + ", ID: " + emp1.employeeID);
        System.out.println("Employee 2: " + emp2.employeeName + ", ID: " + emp2.employeeID);
        System.out.println("Employee 3: " + emp3.employeeName + ", ID: " + emp3.employeeID);
    }
}
