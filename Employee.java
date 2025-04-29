public class Employee {
    String name;
    String address;
    int id;
    double salary;

    public Employee(String name,String address, int id, double salary) {
        this.name = name;
        this.address=address;
        this.id = id;
        this.salary = salary;

    }

    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Address " + address);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Abhi","gayakwad",147, 50000);
        
        emp.display();
    }
}