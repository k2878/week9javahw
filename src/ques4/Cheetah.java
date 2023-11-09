package ques4;

public class Cheetah extends Animal {
    Cheetah(){

    }
    public static void main(String[] args){
        Cheetah obj = new Cheetah();
        obj.move();

    }

    @Override
    public void move() { System.out.println("Run");

    }
}
