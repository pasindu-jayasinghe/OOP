package Encapsulation;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000,20);
        System.out.println(Employee.numberOfEmployees);
        Employee.printNumOfEmployees();
        //with that static field no need to create object(because it's a class member nt an instance)
        int wage = employee.calculateWage(10);
        System.out.println(wage);

        //we can not access instance variable or methods inside a static method without creating the object

    }
}
