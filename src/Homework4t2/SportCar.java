package Homework4t2;

public class SportCar extends Car {
    int maxSpeed;


    public SportCar(String model, String grade, int weight, int maxSpeed) {
        super(model, grade, weight);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start() {
        System.out.println("Спорткар поехал");
    }

    @Override
    public void stop() {
        System.out.println("Спорткар остановился");
    }

    @Override

    public void printInfo(int power, String generate) {
        System.out.println("Марка:  " + model + "  Тип:  " + grade + "Вес:  " + weight + "кг" + "  Максимальная скорость:  " +
                maxSpeed + "км/ч" + "  Мощьность:  " + power + "л/с" + "  Производитель  " + generate);
    }
}

