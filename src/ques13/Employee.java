package ques13;

public class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    public  Employee(){

    }
        public int getemployee_id() { return this.employee_id; }

        public void setemployee_id(int employee_id) { this.employee_id = employee_id; }

        public String getemployee_name() { return this.employee_name; }

        public void setemployee_name(String employee_name) { this.employee_name = employee_name; }

        public double getemployee_salary() { return this.employee_salary = employee_salary;}
    //public void setemployee_salary(double employee_salary) {  this.employee_salary = employee_salary;}

          public static void main(String[] args) {
        Employee M = new Employee();
        M.setemployee_id(05);
        M.setemployee_name("Alia");
        System.out.println(M.getemployee_id());
        System.out.println(M.getemployee_name());
        System.out.println(M.getemployee_salary());

        }
}




