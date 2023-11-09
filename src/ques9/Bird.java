package ques9;

public class Bird extends Animal{


    @Override
    public void move() {
        System.out.println("Birds flies");

    }
    @Override
    public void makeSound(){
       System.out.println ("Birds Makes Chirp Chirp Sounds");
    }
}