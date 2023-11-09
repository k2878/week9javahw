package ques8;

public class manager extends employee {
    double salary;
    public manager(double salaryValue){
        this.salary = salaryValue;
    }
    @Override
    public void calculateSalary(){
        System.out.println("Salary of a Manager: $");
        System.out.println(salary);

    }

}
