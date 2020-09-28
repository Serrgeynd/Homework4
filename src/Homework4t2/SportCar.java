package Homework4t2;

public class SportCar extends Car {int maxSpeed;
    @Override
    public void start() {
        System.out.println("Спорткар поехал");
    }


    @Override
    public void stop() {System.out.println("Спорткар остановился");

    }

    @Override

    public void printlnfo() {
        engine.power = 45;
        engine.generant = "Fiat";
        model = ("ferrary");
        grade = ("Суперкар");
        weight = 1456;
        maxSpeed = 456;
        System.out.printf("Модель:  " +model+"  Класс автомобиля:  "+grade+"  Macca:  "+weight+"  кг  "+"  Двигатель:  "+engine.power+"  л/с+" +" Производитель:  "+engine.generant+
                "  Максимальная скорость:  "+maxSpeed+ "км/ч"
        );






    }

    public static void main (String[]args){
        Car sportCar = new SportCar();
        sportCar.start();
        sportCar.stop();
        sportCar.printlnfo();

    }
}
