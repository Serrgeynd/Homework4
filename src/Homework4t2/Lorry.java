package Homework4t2;

public class Lorry extends Car {
    int tonnage = 45;

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }


    @Override
    public void stop() {
        System.out.println("Грузовик остановился");

    }

    @Override
    public void printlnfo() {
        engine.power = 130;
        engine.generant = "ZIL";
        model = ("ZIL");
        grade = ("Грузовик");
        weight = 3456;
        tonnage = 5;
        System.out.printf("Модель:  " + model + "  Класс автомобиля:  " + grade + "  Macca:  " + weight + "  тон  " + "  Двигатель:  " + engine.power + "  л/с+" + " Производитель:  " + engine.generant +
                "  Грузоподъемность:  " + tonnage + "тон"
        );

    }

    public static void main(String[] args) {
        Car lory = new Lorry();
        lory.start();
        lory.stop();
        lory.turnLeft();
        lory.turnRight();
        lory.printlnfo();

    }
}