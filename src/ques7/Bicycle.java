package ques7;

public class Bicycle<speed> extends Vehicle{
    int speed;
    public Bicycle(int speed){
        this.speed = speed;
    }
    public static void main(String[] args){
        Car obj = new Car(100);
        obj.speedUp();
        Bicycle b = new Bicycle(15);
        b.speedUp();

    }
    @Override
    public void speedUp(){
        System.out.println("Bicycle speed increses upto 15/mph");
        System.out.println(speed);



        }
    }

