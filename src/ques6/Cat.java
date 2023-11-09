package ques6;

public class Cat extends AnimalFamily {
    Cat(){

    }
    public static void main(String[] args){
        AnimalFamily object = new AnimalFamily();
        object.Sound();
        Bird obj = new Bird();
        obj.Sound();
        Cat obj1 = new Cat();
        obj1.Sound();

    }

    @Override
    public void Sound() {System.out.println("Cat Says Meaow Meaow");



    }
}
