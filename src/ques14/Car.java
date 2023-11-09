package ques14;

public class Car {
    private String company_name;
    private String model_name;
    private int year;
    private int mileage;
    public Car(){

    }
    public String getCompany_name(){return this.company_name;}
    public void setCompany_name(String company_name){this.company_name = company_name;}
    public String getModel_name(){return this.model_name;}
    public void setModel_name(String model_name){this.model_name = model_name;}
    public int getYear(){return this.year;}
    public void setYear(int year){this.year = year;}
    public int getMileage(){return this.mileage;}
   // public void setMileage(int mileage){this.mileage = mileage;}
    public static void main(String[] args){
        Car c = new Car();
        c.setCompany_name("General Motors");
        c.setModel_name("lexus");
        c.setYear(2020);
        System.out.println(c.getCompany_name());
        System.out.println(c.getModel_name());
        System.out.println(c.getYear());
        System.out.println(c.getMileage());

    }

}
