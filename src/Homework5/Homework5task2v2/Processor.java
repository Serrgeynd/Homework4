package Homework5.Homework5task2v2;

public class Processor implements Iron {
    double frequency;
    int quantytyCore;
    int memory;
    String name;
    String produser;

    Processor(double frequency, int quantytyCore, int memory, String name, String produser) {
        this.frequency = frequency;
        this.quantytyCore = quantytyCore;
        this.memory = memory;
        this.name = name;
        this.produser = produser;
    }

    @Override
    public void start() {
        System.out.println("Частота:  " + frequency + "  Количество ядер:  " + quantytyCore + "  Память:  " + memory + "  Название:  " +
                name + "  Производитель:  " + produser);

    }
}
