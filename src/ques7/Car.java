package ques7;

public class Car extends Vehicle{
    int speed;
    public Car(int speed){
        this.speed = speed;
    }
    @Override
    public void speedUp(){
        System.out.println("Car Speed Increases to:100/mph");
        System.out.println(speed);
    }



}
