package ques11;

public class Person {
    private String name;
    private int age;
    private String country;

    public Person(){

    }
    public  String getName() {return this.name;}
    public void setName(String name){this.name = name;}

    public int getage() {return this.age;}
    public void setage(int age) {this.age = age;}

    public String getCountry() {return this.country;}
    public void setCountry(String country) {this.country = country;}

    public static void main(String[] args){
        Person a = new Person();
        a.setName("kulwinder");
        a.setage(30);
        a.setCountry("United States");
        System.out.println(a.getName());
        System.out.println(a.getage());
        System.out.println(a.getCountry());


    }


    }


