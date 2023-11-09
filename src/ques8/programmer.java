package ques8;

public class programmer extends employee {
    double salary;
    public programmer(double salary) {
        this.salary = salary;
    }
    @Override
    public void calculateSalary(){
        System.out.println("Salary of a Programmer: $");
        System.out.println(salary);

    }
    public static void main(String[] args) {
        employee a = new employee();
        a.calculateSalary();
        manager object = new manager(150000);
        object.calculateSalary();
        programmer obj1 = new programmer(90000);
        obj1.calculateSalary();

    }
}
