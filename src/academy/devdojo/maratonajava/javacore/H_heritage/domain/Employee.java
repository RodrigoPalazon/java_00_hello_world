package academy.devdojo.maratonajava.javacore.H_heritage.domain;

public class Employee extends Person{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void printData() {
        super.printData();
        System.out.println("Salary: " + this.salary);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
