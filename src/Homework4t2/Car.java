package Homework4t2;

public abstract class Car {
    public String model;
    public String grade;
    public int weight;
    Engine engine = new Engine();

    public abstract void start();

    public abstract void stop();

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public abstract void printlnfo();
}


