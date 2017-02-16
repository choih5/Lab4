package lab4Start;

/**
 * Created by nuoup on 2017-02-15.
 */
public class Employee implements Rules{
    private String name;
    private int salary;

    Employee() {
        name=null;
        salary=0;
    }

    Employee(String name,int salary) {
        this.name=name;
        this.salary=salary;
    }
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        String employInformation = "The employee's name is " + name + "and salary is " + salary;
        return employInformation;
    }
}
