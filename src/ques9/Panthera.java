package ques9;

public class Panthera extends Animal{

    @Override
    public void move(){
        System.out.println("The Panthera Runs");

    }
    @Override
    public void makeSound(){
        System.out.println("The Panthera Says Roar Roar");

    }
    public static void main(String[] args){
        Animal object = new Animal();
        object.move();

        Bird Obj1 = new Bird();
        Obj1.move();

        Panthera obj2 = new Panthera();
        obj2.move();

        object.makeSound();
        Obj1.makeSound();
        obj2.makeSound();



    }
}
