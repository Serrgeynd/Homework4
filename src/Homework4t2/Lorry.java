package Homework4t2;

public class Lorry extends Car {
    public int tonnage;

    public Lorry(String model, String grade, int weight, int tonnage) {
        super(model, grade, weight);
        this.tonnage = tonnage;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo(int power, String generate) {
        System.out.println("Марка:  " + model + "  Тип:  " + grade + "  Вес:  " + weight + "кг" + " Грузоподъемность:  " + tonnage + "кг" + "  Мощьность:  " +
                +power + "л/с" + "  Производитель:  " + generate);
    }
}