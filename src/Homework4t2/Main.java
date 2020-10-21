package Homework4t2;

public class Main {
    public static void main(String[] args) {
        Car sportCar = new SportCar("Ferary", "Спорткар", 980, 322);
        Car llory = new Lorry("ZIL", "Грузовик", 3456, 2500);

        sportCar.start();
        sportCar.stop();
        sportCar.printInfo(200, "Ferrary");

        llory.start();
        llory.stop();
        llory.turnLeft();
        llory.turnRight();
        llory.printInfo(130, "ЗиЛ");
    }
}
