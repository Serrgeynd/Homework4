package Homework4t2;

public abstract class Car {
    public String model;
    public String grade;
    public int weight;

    Engine motor = new Engine(0, "");

    public Car(String model, String grade, int weight) {
        this.model = model;
        this.grade = grade;
        this.weight = weight;
    }

    public abstract void start();

    public abstract void stop();

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public abstract void printInfo(int power, String generate);
}


